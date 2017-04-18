package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :订单冲正/反转(五方分佣)

public class reversalOrder_parameter extends parameter
{
	public String driver_id = "";
	public String service_order_id = "";
	public String source = "10";
	public String rewards_type = "100";
	public String extra = "call from java";
	public String operator_id = "12345678";
	public String order_id = "";
	public String distribute_status = "";
	public String distribute_driver_amount = "";
	public String distribute_company_amount = "";
	public String distribute_yidao_amount = "";
	public String distribute_labour_company_amount = "";
	public String distribute_fund_amount = "";
	public String company_receipt_amount = "";
	public String labour_company_receipt_amount = "";
	public String driver_laowu_amount = "";
	public String end_time = "";
	
	public reversalOrder_parameter()
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
		switch(name)
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
			case "extra":
				this.extra = value;
				break;
			case "operator_id":
				this.operator_id = value;
				break;
			case "order_id":
				this.operator_id = value;
				break;
			case "distribute_status":
				this.distribute_status = value;
				break;
			case "distribute_driver_amount":
				this.distribute_driver_amount = value;
				break;
			case "distribute_company_amount":
				this.distribute_company_amount = value;
				break;
			case "distribute_yidao_amount":
				this.distribute_yidao_amount = value;
				break;
			case "distribute_labour_company_amount":
				this.distribute_labour_company_amount = value;
				break;
			case "distribute_fund_amount":
				this.distribute_fund_amount = value;
				break;
			case "company_receipt_amount":
				this.company_receipt_amount = value;
				break;
			case "labour_company_receipt_amount":
				this.labour_company_receipt_amount = value;
				break;
			case "driver_laowu_amount":
				this.driver_laowu_amount = value;
				break;
			case "end_time":
				this.end_time = value;
				break;
			default:
				log.out("参数体实例中未能发现对应的参数名", name);
		}
	}
}
