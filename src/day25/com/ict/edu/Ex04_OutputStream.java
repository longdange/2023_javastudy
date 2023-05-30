package day25.com.ict.edu;
//바이트 출력 스트림:OutputStream 자식클래스 FileOutputStream  사용
//               FileOutputStream를 이용해서 해당파일에 내용을 1byte쓰기(출력,저장)
//         주요매서드:write(int b):int b =>숫자(아스키코드(0~255),한 글자)
//                              **아스키코드(숫자,대문자,소문자,일부특수문자를 숫자와 1:1 매칭한 코드)
//                  write(byte[] b):배열은 아스키코드의 배열이다.
//                  **String클래스에서 getBytes()를 이용해서 byte[]로 만들어서 사용
//                  flush():버퍼 내용이 채워지지 않아도 출력하게 만듦
//                  close():출력 스트림 닫기

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_OutputStream {
	public static void main(String[] args) {
String pathname="D:/KJH/test01.txt";
File file= new File(pathname);
FileOutputStream fos=null;
try {
	//파일이 없으면 생성,있으면 덮어쓰기 한다.
	//fos =new FileOutputStream(file);
	//파일이 없으면 생성 있으면 이어쓰게 한다.
	 fos =new FileOutputStream(file,true);
	 //한 글자 쓰기(1byte 출력=아스키 코드가 1byte)
//	 fos.write(97);
//	 fos.write(65);
//	 fos.write(49);
//	 fos.write('\n');
//	 fos.write('b');
//	 fos.write('o');
//	 fos.write('y');
//	 //영어,숫자를 제외하고 사용 불가 한글과 한자는 안된다.
//	 //한글 입력하면 오류 발생
//	 //byte[]arr= {'h','e','l','l','o','민','국','1','2'};
//	 byte[]arr= {'h','e','l','l','o','H','1','2'};
//	 fos.write(arr);
	 //한글,한자 모든 글자 처리 가능
	 String str="Hello대한민국\n123456";
	 byte[] arr=str.getBytes();
	 fos.write(arr);
	 fos.flush();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally {
	try {
		fos.close();
	} catch (Exception e2) {
		
	}
}

	}
}
