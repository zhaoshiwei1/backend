package com.yongche.api.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class set_testresult_util 
{
	public static void writeCell(String filePath,int x,int y,String value) {
		try {
			// ����Excel�Ĺ������ Workbook,��Ӧ��һ��excel�ĵ�
			HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(filePath));
			HSSFSheet sheet=wb.getSheetAt(0);
			HSSFRow row=sheet.getRow(x);
			HSSFCell cell=row.getCell((short) y);
			cell.setCellValue(value);
			FileOutputStream os;
			os = new FileOutputStream(filePath);
			wb.write(os);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
