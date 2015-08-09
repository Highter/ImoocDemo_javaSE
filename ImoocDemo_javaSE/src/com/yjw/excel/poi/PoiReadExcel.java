package com.yjw.excel.poi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


/**
 * POI����Excel�ļ�
 * @author yjw 2015-8-9
 *
 */
public class PoiReadExcel {
	public static void main(String[] args) {
		//��Ҫ������Excel�ļ�
		File file = new File("F:/poi_text.xls");
		
		try {
			//����Excel����ȡ�ļ�����
			HSSFWorkbook workbook = new HSSFWorkbook(FileUtils.openInputStream(file));
			//��ȡ��һ��������workbook.getSheet("Sheet0");
//			HSSFSheet sheet = workbook.getSheet("Sheet0");
			//��ȡĬ�ϵ�һ��������sheet
			HSSFSheet sheet = workbook.getSheetAt(0);
			int firstRowNum = 0;
			//��ȡsheet�����һ���к�
			int lastRowNum = sheet.getLastRowNum();
			for(int i=firstRowNum;i<=lastRowNum;i++){
				HSSFRow row = sheet.getRow(i);
				//��ȡ��ǰ�����Ԫ���к�
				int lastCeelNum = row.getLastCellNum();
				for(int j=0;j<lastCeelNum;j++){
					HSSFCell cell = row.getCell(j);
					String value = cell.getStringCellValue();
					System.out.print(value+"  ");
				}
				System.out.println();
			}
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
