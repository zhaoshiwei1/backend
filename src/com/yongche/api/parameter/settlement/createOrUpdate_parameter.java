package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//�ӿ����� :��������·ֳɱ�����¼

public class createOrUpdate_parameter extends parameter
{
	public String city = "";
	public String product_type_id = "";
	public String car_type_id = "";
	public String yidao_ratio = "";
	public String operator_id = "";
	
	public createOrUpdate_parameter()
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
			case "car_type_id":
				this.car_type_id = value;
				break;
			case "yidao_ratio":
				this.yidao_ratio = value;
				break;
			case "operator_id":
				this.operator_id = value;
				break;
			default:
				log.out("������ʵ����δ�ܷ��ֶ�Ӧ�Ĳ�����", name);
		}
	}
}
