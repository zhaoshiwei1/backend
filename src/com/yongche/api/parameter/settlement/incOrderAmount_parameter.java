package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//�ӿ����� :����(�巽��Ӷ)-���Ӷ������

public class incOrderAmount_parameter extends parameter
{
	public String driver_id = "121";
	public String amount = "12121";
	public String service_order_id = "1111";
	public String source = "10";
	public String rewards_type = "100";
	public String extra = "test_flag";
	public String operator_id = "22345678";
	public String order_id = "";

	public incOrderAmount_parameter()
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
			default:
				log.out("������ʵ����δ�ܷ��ֶ�Ӧ�Ĳ�����", name);
		}
	}
}
