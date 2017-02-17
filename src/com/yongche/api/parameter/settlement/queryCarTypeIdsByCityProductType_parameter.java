package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :根据城市产品类型获取车型
//请求方式 :GET

public class queryCarTypeIdsByCityProductType_parameter extends parameter
{	
	public String city = "";
	public String product_type_id = "";
	
	public queryCarTypeIdsByCityProductType_parameter()
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
			case "product_type_id":
				this.product_type_id = value;
				break;
			default: 
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}

}
