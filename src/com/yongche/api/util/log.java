package com.yongche.api.util;

public class log 
{
	
	public static void out(String tag, String msg)
	{
		if(GlobalDefine.out)
		{
			String t = tag_format(tag);
			System.out.print(t);
			System.out.print(msg+"\n");
		}
	}
	
	public static String tag_format(String tag)
	{
		int l = tag.length();
		tag = tag + ":";
		if(25>l)
		{
			for(int i=0;i<(25-l); i++)
			{
				tag = tag+" ";
			}
		}
		return tag;
	}
	
}
