package com.yongche.api.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class get_parameter_util 
{
	public static List<Map> get_parameter_list(String filepath, int p_num) throws FileNotFoundException, IOException
	{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet s = wb.createSheet();
		HSSFRow row = s.createRow(0);
		HSSFCell cell = row.createCell((int)0,0);

		wb = new HSSFWorkbook(new FileInputStream(filepath));
		s = wb.getSheetAt(0);

		int rowNums=s.getLastRowNum();
		HSSFRow r_name = s.getRow(0);
		
		List<Map> list = null;
		
		for (int j = 1; j<rowNums; j++)
		{
			Map<String, String> m = new HashMap<String, String>();
			HSSFRow r = s.getRow(j);
			for (int i = 0; i < p_num; i ++)
			{
				r_name.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
				String parameter_name = r_name.getCell(i).getStringCellValue();
				
				r.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				String parameter_value = r.getCell(j).getStringCellValue();
				
				m.put("name", parameter_name);
				m.put("value", parameter_value);
			}
			list.add(m);
		}
	
		return list;
		
	}
}


