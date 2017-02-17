package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :根据主键更新单条城市配置数据

public class modifyById_parameter extends parameter
{
	public String id = "";
	public String yidao_ratio = "";
	public String operator_id = "";
	
	public modifyById_parameter()
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
			case "yidao_ratio": 
				this.yidao_ratio = value;
				break;
			case "operator_id":
				this.operator_id = value;
				break;
			default:
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}
	
}
