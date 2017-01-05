package com.yongche.api.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import com.yongche.api.parameter.settlement.settlement_parameter;

public class excel_util 
{
	public static List<settlement_parameter> get_parameter_list(String filepath, int p_num) throws FileNotFoundException, IOException
	{
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet s = wb.createSheet();
		HSSFRow row = s.createRow(0);
		HSSFCell cell = row.createCell((int)0,0);

		wb = new HSSFWorkbook(new FileInputStream(filepath));
		s = wb.getSheetAt(0);

		int rowNums=s.getLastRowNum();
		
		ArrayList name_list = new ArrayList();
		HSSFRow r_name = s.getRow(0);
		for (int i = 0; i < p_num; i ++)
		{
			r_name.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
			String temp_name = r_name.getCell(i).getStringCellValue();
			name_list.add(temp_name);
		}
		
		List<settlement_parameter> params=new ArrayList<settlement_parameter>();
		
		for(int i=1;i<=rowNums;i++)
		{
			 HSSFRow r = s.getRow(i);
			 settlement_parameter param= new settlement_parameter();
			 for(int j = 0; j<p_num; j ++)
			 {
				r.getCell(j).setCellType(Cell.CELL_TYPE_STRING);
				String value = r.getCell(j).getStringCellValue();
				String name = name_list.get(j).toString();
				param.set_parameter(name, value);
			 }
			 params.add(param);
		 }
		 return params;
	}
}

