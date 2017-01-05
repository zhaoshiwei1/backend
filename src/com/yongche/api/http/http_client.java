package com.yongche.api.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yongche.api.parameter.settlement.settlement_parameter;
import com.yongche.api.util.jsons_util;
import com.yongche.api.util.object_util;

public class http_client 
{
	public static void client() throws Exception
	{
		String filepath = "FILE PATH";
		int para_num = 0;//
		List<settlement_parameter> params = new ArrayList<settlement_parameter>();
		if(para_num != 0)
		{
			params = com.yongche.api.util.excel_util.get_parameter_list(filepath,para_num);
		}else
		{
			settlement_parameter s_p = new settlement_parameter();
			params.add(s_p);
		}
		
		for(settlement_parameter pa:params){
			try {
					List<Map> pa_list = object_util.getFieldsValue(pa);
					//System.out.print(pa_list.toString() + "\n");
					String js = jsons_util.BuildJson(pa_list);
					//System.out.print(js + "\n");
					URL serverUrl= new URL("http://sandbox.settlement.yongche.org/V1/Driveraccount/computeDistribute");

					URLConnection uct= serverUrl.openConnection();
					HttpURLConnection hutc=(HttpURLConnection)uct;	
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
					
//以下代码为获取返回数据， 临时注释
					// 获取返回的数据	
					StringBuffer buffer=new StringBuffer();
					BufferedReader reader = null;
					InputStream ins=hutc.getInputStream();
					reader = new BufferedReader(new InputStreamReader(ins,"UTF-8"));
					String sg=reader.readLine();
					if (sg!= null)
					{
				           buffer.append(sg);
				    }
				    System.out.println("接收返回值:" + buffer+ "\n");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
