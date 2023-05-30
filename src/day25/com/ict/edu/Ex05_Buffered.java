package day25.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Ex04의 속도 향상을 위해서 BufferedOutputStream사용
//BufferedOutputStream는 혼자서는 사용하지 않는다. 반드시 OutputStream 중 하나와 같이 사용 된다. 

public class Ex05_Buffered {
public static void main(String[] args) {
	String pathname="D:/KJH/test02.txt";
	File file =new File(pathname);
	FileOutputStream fos =null;
	BufferedOutputStream bos=null;
	try {
		fos=new FileOutputStream(file);
		bos=new BufferedOutputStream(fos);
		String msg= "Hello\n안녕\n大韓\n123456";
		byte[] b=msg.getBytes();
		fos.write(b);
		fos.flush();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			fos.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}
}
