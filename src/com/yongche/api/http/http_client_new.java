package com.yongche.api.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

import com.yongche.api.util.jsons_util;
import com.yongche.api.util.object_util;

public class http_client_new 
{
	public static void client(List<Object> params, String url) throws Exception
	{
		
		for(Object pa:params){
			try {
					List<Map> pa_list = object_util.getFieldsValue(pa);
					//System.out.print(pa_list.toString() + "\n");
					String js = jsons_util.BuildJson(pa_list);
					//System.out.print(js + "\n");
					URL serverUrl= new URL(url);

					URLConnection uct= serverUrl.openConnection();
					HttpURLConnection hutc=(HttpURLConnection)uct;	
					// ���ñ��Ĳ���
					hutc.setRequestMethod("POST");
				
					// �����Ƿ���httpUrlConnection�������Ϊ�����post���󣬲���Ҫ���� http�����ڣ������Ҫ��Ϊtrue, Ĭ���������false; 
					hutc.setDoOutput(true);
				
					// �����Ƿ��httpUrlConnection���룬Ĭ���������true
					hutc.setDoInput(true);
					
					hutc.setUseCaches(false);
		            hutc.setInstanceFollowRedirects(true);
		            hutc.setRequestProperty("Content-Type","application/json");
					//hutc.setAllowUserInteraction(true);
				
					// ��������д������data
					OutputStream out=hutc.getOutputStream();
					
					out.write(js.getBytes("UTF-8"));
					out.flush();
					out.close();
					
//���´���Ϊ��ȡ�������ݣ� ��ʱע��
					// ��ȡ���ص�����	
					StringBuffer buffer=new StringBuffer();
					BufferedReader reader = null;
					InputStream ins=hutc.getInputStream();
					reader = new BufferedReader(new InputStreamReader(ins,"UTF-8"));
					String sg=reader.readLine();
					if (sg!= null)
					{
				           buffer.append(sg);
				    }
				    System.out.println("���շ���ֵ:" + buffer+ "\n");
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
}
