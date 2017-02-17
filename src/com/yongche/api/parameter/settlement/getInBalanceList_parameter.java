package com.yongche.api.parameter.settlement;

import com.yongche.api.parameter.parameter;
import com.yongche.api.util.log;

//接口名称 :司机账户明细结算中列表检索

public class getInBalanceList_parameter extends parameter
{
	public String driver_id = "";
	public String limit = "";
	public String offset = "";

	public getInBalanceList_parameter()
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
				this.driver_id =value;
				break;
			case "limit":
				this.limit = value;
				break;
			case "offset":
				this.offset = value;
				break;
			default:
				log.out("No Parameter", name);
		}
	}
}
