package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :删除单条佣金数据

public class deleteById_parameter extends parameter
{
	public String id = "";
	
	public deleteById_parameter()
	{
		
	}
	
	@Override
	public String get_url()
	{
		return null;
	}
	
	@Override
	public void set_parameter(String name, String value)
	{
		switch (name)
		{
			case "id":
				this.id = value;
				break;
			default:
				log.out("No parameter", name);
		}
	}
}
