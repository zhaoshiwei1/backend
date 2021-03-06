package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :风控订单申诉补回

public class orderAppealBack_parameter extends parameter
{
	public String driver_id = "";
	public String service_order_id = "";
	public String source = "10";
	public String rewards_type = "100";
	public String driver_settlement_id = "";
	public String extra = "called by java";
	public String operator_id = "12345678";
	public String order_id = "";
	
	public orderAppealBack_parameter()
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
			case "source":
				this.source = value;
				break;
			case "rewards_type":
				this.rewards_type = value;
				break;
			case "driver_settlement_id":
				this.driver_settlement_id = value;
				break;
			case "extra":
				this.extra = value;
				break;
			case "operator_id":
				this.operator_id = value;
				break;
			case "order_id":
				this.order_id = value;
				break;
			default:
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}
}
