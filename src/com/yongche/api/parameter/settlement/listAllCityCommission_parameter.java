package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :获取佣金列表

public class listAllCityCommission_parameter extends parameter
{
	public String city = "";
	
	public listAllCityCommission_parameter()
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
			case "city":
				this.city = value;
				break;
			default:
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}
}
