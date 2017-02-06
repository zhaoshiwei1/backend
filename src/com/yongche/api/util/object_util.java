package com.yongche.api.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class object_util 
{	
    public static List getFieldsValue(Object obj) 
    {
    	  Field[] fields = obj.getClass().getDeclaredFields();
    	  String[] types = {"java.lang.Integer",
    	        "java.lang.Double",
    	        "java.lang.Float",
    	        "java.lang.Long",
    	        "java.lang.Short",
    	        "java.lang.Byte",
    	        "java.lang.Boolean",
    	        "java.lang.Character",
    	        "java.lang.String",
    	        "int","double","long","short","byte","boolean","char","float"};
         List list = new ArrayList();
    	  
  		 Map infoMap = null;
  		
    	  for(Field f : fields)
    	  {
    	   f.setAccessible(true);
    	   try{
    		   for(String str : types) 
	    	    {
    			   if(f.getType().getName().equals(str))
    			   {
    			  		infoMap = new HashMap();
    			  		infoMap.put("name", f.getName());
    			  		infoMap.put("value", f.get(obj));
    			  		log.c(f.getName(),(f.get(obj)).toString());
    			  		list.add(infoMap);
    			   }
	    	    	 //System.out.println("字段："+f.getName()+" 类型为："+f.getType().getName()+" 值为："+ f.get(obj));
	    	     
	    	    }
    	      } 
    	   catch (IllegalArgumentException e) 
    	   {
    		   e.printStackTrace();
    	   } 
    	   catch (IllegalAccessException e) 
    	   {
    	    e.printStackTrace();
    	   }
    	  }
    
    	  return list;
    }
    
}
