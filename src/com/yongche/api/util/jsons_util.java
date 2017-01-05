package com.yongche.api.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 使用json-lib构造和解析Json数据
 */
public class jsons_util {

	public static String BuildJson(List<Map> lis) throws JSONException 
	{	 
         JSONObject jo = new JSONObject();
    	 for (Map p : lis)
    	 {
    		 jo.put(p.get("name").toString(), p.get("value").toString());
    	 }
    	 
    	 return jo.toString();
         //return jo.toString();

    }

}
