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

import com.yongche.api.util.excel_util;
import com.yongche.api.http.http_client;
import com.yongche.api.http.http_client_new;
import com.yongche.api.parameter.settlement.settlement_parameter;
import com.yongche.api.util.jsons_util;
import com.yongche.api.util.object_util;

public class main 
{
	public static final String filepath = "FILE PATH";
	public static final int para_num = 0;
	public static final String url = "http://sandbox.settlement.yongche.org/V1/Driveraccount/computeDistribute";
	
	public static void main(String[]agrs)
	{
		http_client_new a=new http_client_new();
		try {
				List<Object> params = new ArrayList<Object>();
				if(para_num != 0)
				{
					//params = com.yongche.api.util.excel_util.get_parameter_list(filepath,para_num);
				}else
				{
					Object s_p = new settlement_parameter();
					params.add(s_p);
				}
				a.client(params, url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}