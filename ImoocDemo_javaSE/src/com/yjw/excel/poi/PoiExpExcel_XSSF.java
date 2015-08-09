package com.yjw.excel.poi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * poi����excel�ļ�
 * @author yjw 2015-8-9
 *
 */
public class PoiExpExcel_XSSF {
	public static void main(String[] args) {
		String[] title = {"id","name","sex"};
		//����excel������
		XSSFWorkbook workbook = new XSSFWorkbook();
		//����һ��������sheet
		Sheet sheet = workbook.createSheet();
		//������һ��
		Row row = sheet.createRow(0);
		Cell cell = null;
		//�����һ������id,name,sex
		for(int i = 0;i<title.length;i++){
			cell = row.createCell(i);
			cell.setCellValue(title[i]);
		}
		//׷������
		for(int i=1;i<=10;i++){
			Row nextRow = sheet.createRow(i);
			Cell nextCell = nextRow.createCell(0);
			nextCell.setCellValue("a"+i);
			
			nextCell = nextRow.createCell(1);
			nextCell.setCellValue("user"+i);
			
			nextCell = nextRow.createCell(2);
			nextCell.setCellValue("��"+i);
		}
		
		//����һ���ļ�
		File file = new File("F:/poi_text.xlsx");
		try {
			file.createNewFile();
			//��Excel���ݴ���
			FileOutputStream stream = FileUtils.openOutputStream(file);
			workbook.write(stream);
			workbook.close();
			stream.close();
			System.out.println("�����߰汾excel����,�ļ�Ϊ��"+file.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("�����߰汾excel�쳣");
		}
	}
}
