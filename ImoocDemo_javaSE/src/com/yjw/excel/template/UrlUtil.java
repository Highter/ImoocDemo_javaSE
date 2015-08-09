package com.yjw.excel.template;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class UrlUtil {
	public static void main(String[] args) {
		UrlUtil urlUtil = new UrlUtil();
		urlUtil.showURL();
	}
	
	public void showURL(){
		 // ��һ�֣���ȡ����صĸ�·��  f--C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\bin
       File f = new File(this.getClass().getResource("/").getPath());
       System.out.println("f--"+f);

       // ��ȡ��ǰ������ڹ���·��  f2--C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\bin\com\yjw\excel\template
       File f2 = new File(this.getClass().getResource("").getPath());
       System.out.println("f2--"+f2);

       // �ڶ��֣���ȡ��Ŀ·��   courseFile--C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE
       File directory = new File("");// ����Ϊ��
       String courseFile;
		try {
			courseFile = directory.getCanonicalPath();
			System.out.println("courseFile--"+courseFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

       // �����֣�xmlpath--file:/C:/Users/Orange/git/ImoocDemo_javaSE/ImoocDemo_javaSE/bin/
       URL xmlpath = this.getClass().getClassLoader().getResource("");
       System.out.println("xmlpath--"+xmlpath);
    

       // �����֣� user.dir--C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE
       System.out.println("user.dir--"+System.getProperty("user.dir"));
       

       // �����֣�  ��ȡ���е���·�� ����jar����·��
       /*
        * java.class.path--
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\bin;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\jxl.jar;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\poi-3.11-20141221.jar;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\commons-io-2.2.jar;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\xmlbeans-2.6.0.jar;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\poi-ooxml-schemas-3.11-20141221.jar;
        * C:\Users\Orange\git\ImoocDemo_javaSE\ImoocDemo_javaSE\lib\poi-ooxml-3.11-20141221.jar
        */
       System.out.println("java.class.path--"+System.getProperty("java.class.path"));
	}
}
