package day25.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
public static void main(String[] args) {
	String pathname="D:/KJH/test02.txt";
	File file =new File(pathname);
	
	try {
		FileOutputStream fos=new FileOutputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e) {
		// TODO: handle exception
	}
}
}
