package com.yongche.api.main;

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

import org.json.JSONObject;

import com.yongche.api.http.http_client_async;
import com.yongche.api.http.http_client_sync;
import com.yongche.api.parameter.settlement.settlement_parameter;
import com.yongche.api.util.jsons_util;
import com.yongche.api.util.object_util;

public class main 
{
	public static final String filepath = "FILE PATH";
	public static final int para_num = 0;
	public static final String url = "";
	
	public static void main(String[]agrs)
	{
		http_client_sync a=new http_client_sync();
		try {
				List<Object> params = new ArrayList<Object>();
				if(para_num != 0)
				{
					
				}else
				{
					Object s_p = new settlement_parameter();
					params.add(s_p);
					Long time1 = System.currentTimeMillis();
					System.out.print("**********************************\n");
					System.out.print("*" + time1+"\n");
					System.out.print("**********************************\n");
					for(int i = 0; i<100; i++)
					{
						a.client(params, url);
					}
					Long time2 = System.currentTimeMillis(); 
					System.out.print("**********************************\n");
					System.out.print("*" + time2+"\n");
					System.out.print("**********************************\n");
					System.out.print("*" + (time2 - time1)+"\n");
					System.out.print("**********************************\n");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}