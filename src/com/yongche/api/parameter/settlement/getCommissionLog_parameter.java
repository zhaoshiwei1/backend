package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//****************************
//*      分佣结算快照查询                                  *
//****************************

public class getCommissionLog_parameter extends parameter
{
	public String driver_id = "";
	public String service_order_id = "";
	
	public getCommissionLog_parameter()
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
			case "driver_id":
				this.driver_id = value;
				break;
			case "service_order_id":
				this.service_order_id = value;
				break;
			default:
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}
}
