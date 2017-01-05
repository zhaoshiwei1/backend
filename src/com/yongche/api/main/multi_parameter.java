package com.yongche.api.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.yongche.api.util.get_parameter_util;

public class multi_parameter 
{
	public static String filepath = "";
	public static int p_num = 1;
	
	public static void main(String[] args)
	{
		try {
			List<Map> list = get_parameter_util.get_parameter_list(filepath, p_num);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
