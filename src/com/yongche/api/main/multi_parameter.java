package com.yongche.api.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.yongche.api.http.http_client_new;
import com.yongche.api.parameter.parameter;
import com.yongche.api.parameter.settlement.settlement_parameter;
import com.yongche.api.util.get_parameter_util;
import com.yongche.api.util.set_parameter_util;

public class multi_parameter 
{
	public static final String filepath = "";
	public static final int p_num = 1;
	public static final String url = "";
	
	public static void main(String[] args)
	{
		List<Object> params = new ArrayList<Object>();
		try {
			List<Map> list = get_parameter_util.get_parameter_list(filepath, p_num);
			for(Map m : list)
			{
				Object s_p = new settlement_parameter();
				Object s_p_fixed = set_parameter_util.set_parameter(m, (settlement_parameter) s_p);//这里的类型投射可能是个坑
				params.add(s_p_fixed);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		http_client_new a=new http_client_new();
		
		try {
			a.client(params, url);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
