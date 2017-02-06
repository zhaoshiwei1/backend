package com.yongche.api.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yongche.api.util.jsons_util;
import com.yongche.api.util.log;
import com.yongche.api.util.object_util;

public class http_client_async 
{
	public void client(List<Object> params, String url) throws Exception
	{
		
		for(Object pa:params){
			try {
					List<Map> pa_list = object_util.getFieldsValue(pa);
					//System.out.print(pa_list.toString() + "\n");
					String js = jsons_util.BuildJson(pa_list);
					//System.out.print(js + "\n");
					URL serverUrl= new URL(url);

					URLConnection uct= serverUrl.openConnection();
					final HttpURLConnection hutc=(HttpURLConnection)uct;	
					// 设置报文参数
					hutc.setRequestMethod("POST");
				
					// 设置是否向httpUrlConnection输出，因为这个是post请求，参数要放在 http正文内，因此需要设为true, 默认情况下是false; 
					hutc.setDoOutput(true);
				
					// 设置是否从httpUrlConnection读入，默认情况下是true
					hutc.setDoInput(true);
					
					hutc.setUseCaches(false);
		            hutc.setInstanceFollowRedirects(true);
		            hutc.setRequestProperty("Content-Type","application/json");
					//hutc.setAllowUserInteraction(true);
				
					// 开启流，写入数据data
					OutputStream out=hutc.getOutputStream();
					
					out.write(js.getBytes("UTF-8"));
					out.flush();
					out.close();
					
					ExecutorService cachedThreadPool = Executors.newCachedThreadPool();  
	                cachedThreadPool.execute(new Runnable() {  
	                       
	                    public void run() {  
	                          
	                        // do task  
	                        get_response(hutc);  
	                    }  
	                });  
	                cachedThreadPool.shutdown();  
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

	
	public void get_response(HttpURLConnection hutc)
	{
		try {
			StringBuffer buffer=new StringBuffer();
			BufferedReader reader = null;
			InputStream ins = hutc.getInputStream();
			reader = new BufferedReader(new InputStreamReader(ins,"UTF-8"));
			String sg=reader.readLine();
			if (sg!= null)
			{
		           buffer.append(sg);
		    }
		    //System.out.println(buffer+ "\n");
		    log.out("RESPONSE", buffer.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
