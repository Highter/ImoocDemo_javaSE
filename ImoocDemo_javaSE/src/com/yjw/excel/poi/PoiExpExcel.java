package com.yjw.excel.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * poi����excel�ļ�
 * @author yjw 2015-8-9
 *
 */
public class PoiExpExcel {
	public static void main(String[] args) {
		String[] title = {"id","name","sex"};
		//����excel������
		HSSFWorkbook workbook = new HSSFWorkbook();
		//����һ��������sheet
		HSSFSheet sheet = workbook.createSheet();
		//������һ��
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		//�����һ������id,name,sex
		for(int i = 0;i<title.length;i++){
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		//׷������
		for(int i=1;i<=10;i++){
			HSSFRow nextRow = sheet.createRow(i);
			HSSFCell nextCell = nextRow.createCell(0);
			nextCell.setCellValue("a"+i);
			
			nextCell = nextRow.createCell(1);
			nextCell.setCellValue("user"+i);
			
			nextCell = nextRow.createCell(2);
			nextCell.setCellValue("��"+i);
		}
		
		//����һ���ļ�
		File file = new File("F:/poi_text.xls");
		try {
			file.createNewFile();
			//��Excel���ݴ���
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			workbook.close();
			stream.close();
			System.out.println("����excel����,�ļ�Ϊ��"+file.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����excel�쳣");
		}
	}
}
