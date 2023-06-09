package day28.com.ict.edu;
//outputStreamWriter:바이트 스트림을 문자스트림으로 변경
//outputStream(바이트스트림)=>OutputStreamWriter => BufferedWriter(문자 스트림)
//outputStreamReader:바이트 스트림을 문자스트림으로 변경
//InputStream =>InputStreamReader =>Buffedreader

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex02_OutputStreamWriter {
public static void main(String[] args) {
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;
	
	InputStreamReader isr=null;
	BufferedReader br=null;
	try {
		//System.out.println("원하는 문자:");
		//모니터에 정보를 내보내자
		osw=new OutputStreamWriter(System.out);
		bw=new BufferedWriter(osw);
		bw.write("원하는 문자:");
		bw.flush();
		
		isr=new InputStreamReader(System.in);
		br=new BufferedReader(isr);
		String msg= br.readLine();
		// 받은 정보 출력
		bw.write("받은 문자:" +msg);
		bw.flush();
		//System.out.println();
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		try {
			br.close();
			isr.close();
			bw.close();
			osw.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
}
}
