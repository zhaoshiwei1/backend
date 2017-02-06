package com.yongche.api.util;

import com.yongche.api.globaldefine.GlobalDefine;

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
	
	public static void a(String tag, String msg)
	{
		if(GlobalDefine.A_DEBUG)
		{
			String t = tag_format(tag);
			System.out.print(t);
			System.out.print(msg+"\n");
		}
	}
	
	public static void b(String tag, String msg)
	{
		if(GlobalDefine.B_DEBUG)
		{
			String t = tag_format(tag);
			System.out.print(t);
			System.out.print(msg+"\n");
		}
	}
	
	public static void c(String tag, String msg)
	{
		if(GlobalDefine.C_DEBUG)
		{
			String t = tag_format(tag);
			System.out.print(t);
			System.out.print(msg+"\n");
		}
	}
	
	public static void d(String tag, String msg)
	{
		if(GlobalDefine.D_DEBUG)
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
