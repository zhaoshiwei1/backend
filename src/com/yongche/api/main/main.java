package com.yongche.api.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import com.yongche.api.parameter.settlement.computeDistribute_parameter;
import com.yongche.api.util.get_parameter_util;
import com.yongche.api.util.jsons_util;
import com.yongche.api.util.object_util;
import com.yongche.api.util.set_parameter_util;
import com.yongche.api.util.GlobalDefine;

public class main 
{
	public static final String filepath = GlobalDefine.FILE_PATH;
	public static final int para_num = GlobalDefine.PARA_NUM;
	public static final String url = GlobalDefine.URL;
	
	public static void main(String[]agrs)
	{
		http_client_sync a=new http_client_sync();
		try {
				List<Object> params = new ArrayList<Object>();
				if(para_num > 0)
				{
					try {
						List<List<Map<String,String>>> list = get_parameter_util.get_parameter_list(filepath, para_num);
						for(List m : list)
						{
							for(int i = 0; i<m.size(); i ++)
							{
								Object s_p = new computeDistribute_parameter();
								Object s_p_fixed = set_parameter_util.set_parameter((Map<String, String>) m.get(i), (computeDistribute_parameter) s_p);//这里的类型投射可能是个坑
								params.add(s_p_fixed);
							}
							
						}
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					try {
						for(int i = 0; i<1; i++)
						{
							a.client(params, url, para_num, filepath);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else
				{
					Object s_p = new computeDistribute_parameter();
					params.add(s_p);
					for(int i = 0; i<1; i++)
					{
						a.client(params, url, para_num, filepath);
					}
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}