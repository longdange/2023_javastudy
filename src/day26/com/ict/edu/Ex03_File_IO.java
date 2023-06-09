package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//D:/KJH/test01.txt 읽어서 D:/KJH/test02.txt 내용 추가
public class Ex03_File_IO {
public static void main(String[] args) {
	String pathname="D:/KJH/test01.txt";
	String pathname2="D:/KJH/test02.txt";
	File file=new File(pathname);
	File file2=new File(pathname2);
	
	FileInputStream fis=null;
	BufferedInputStream bis=null;
	
	FileOutputStream fos=null;
	BufferedOutputStream bos=null;
	try {
		fis=new FileInputStream(file);
		bis=new BufferedInputStream(fis);
		
		
		fos=new FileOutputStream(file2,true);
		bos=new BufferedOutputStream(bos);
		//모든 파일의 복사,이동은 해당 방식으로 해야 된다.
		int b=0;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 
		
	} finally {
		try {
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
			
}
}
