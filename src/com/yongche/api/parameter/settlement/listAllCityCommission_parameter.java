package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//�ӿ����� :��ȡӶ���б�

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
				log.out("������ʵ����δ�ܷ��ֶ�Ӧ�Ĳ�����", name);
		}
	}
}
