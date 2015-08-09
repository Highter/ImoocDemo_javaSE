package com.yjw.excel.jxl;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * JXL����Excel�ļ�
 * @author yjw 2015-8-9
 *
 */
public class JxlExpExcel {
	public static void main(String[] args) {
		String[] title = {"id","name","sex"};
		
		//����Excel�ļ�
//		File file = new File("F:/jxl_test.xlsx");
		File file = new File("F:/jxl_test.xls");
		
		try {
			file.createNewFile();
			//����������
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			//����sheet����ͼҳ��
			WritableSheet sheet = workbook.createSheet("sheet1", 0);
			Label label = null;
			//��һ����������
			for(int i=0;i<title.length;i++){
				label = new Label(i,0,title[i]);
				sheet.addCell(label);
			}
			//׷������
			for(int i = 1;i<10;i++){
				label = new Label(0,i,"a"+1);
				sheet.addCell(label);
				label = new Label(1,i,"user"+1);
				sheet.addCell(label);
				label = new Label(2,i,"��"+1);
				sheet.addCell(label);
			}
			//д������
			workbook.write();
			workbook.close();
			System.out.println("����excel����,�ļ�Ϊ��"+file.getPath());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����excel�쳣");
		}
	}
}
