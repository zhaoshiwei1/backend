package com.yongche.api.util;

import java.util.Map;

import com.yongche.api.parameter.parameter;

public class set_parameter_util 
{
	public static parameter set_parameter(Map<String, String> parameter, parameter p)
	{
		for (Map.Entry<String, String> entry : parameter.entrySet()) 
		{  
			p.set_parameter(entry.getKey(), entry.getValue());
		}  
		return p;
	}
}
