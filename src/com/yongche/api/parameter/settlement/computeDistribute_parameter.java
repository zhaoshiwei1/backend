package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

public class computeDistribute_parameter extends parameter
{
	public String driver_id = "50061750";
	public String amount = "100";
	public String service_order_id = "6366800169965340051";
	public String city = "bj";
	public String car_type_id = "1";
	public String product_type_id = "17";
	public String highway_amount = "";
	public String parking_amount = "";
	public String addons_amount = "";
	public String source = "10";
	public String rewards_type = "100";
	public String extra = "called by java";
	public String operator_id = "1223334444";
	public String order_id = "";
	public String distribute_status = "";
	
	public computeDistribute_parameter()
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
			case "amount":
				this.amount = value;
				break;
			case "service_order_id":
				this.service_order_id = value;
				break;
			case "city":
				this.city = value;
				break;
			case "car_type_id":
				this.car_type_id = value;
				break;
			case "product_type_id":
				this.product_type_id = value;
				break;
			case "highway_amount":
				this.highway_amount = value;
				break;
			case "parking_amount":
				this.parking_amount = value;
				break;
			case "addons_amount":
				this.addons_amount = value;
				break;
			case "source":
				this.source = value;
				break;
			case "rewards_type":
				this.rewards_type = value;
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
			case "distribute_status":
				this.distribute_status = value;
				break;
			default:
				log.out("No Parameter", name);
		}
	}
}
