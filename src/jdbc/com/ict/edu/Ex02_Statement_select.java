package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Ex02_Statement_select {
public static void main(String[] args) {
	 // 1.java를 오라클에 접속할 수 있도록 도와 주는 클래스
	  Connection conn=null;
	  //2.SQL구문 작성을 도와주는 클래스
	  Statement stmt =null;
	  //3-1 select문의 결과를 받는 클래스
	  ResultSet rs= null;
	  //3-2 select문을 제외한 (delete,update,insert)결과를 받는 변수
	  int result=0;
	  try {
		  //4.jdbc드라이버 로딩:오라클,MySQL 등 각각 내용이 다르다
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//5.접속하기 위한 정보 저장
		//오라클,Mysql
		String ur1="jdbc:oracle:thin:@localhost:1521:xe";
		String user="c##jiho";
		String password ="1111";
		//6.접속하기:
		
		conn=DriverManager.getConnection(ur1, user, password);
	    //7.SQL작성하기
		String sq1 ="select * from BOOK";
		//8.SQL를 보낼 수 있는 구문 만들기
		stmt=conn.createStatement();
		//9.SQL를 담아서 보내고 결과 받기
		//9-1 select
		rs=stmt.executeQuery(sq1);
		while(rs.next()) {
			System.out.print(rs.getString("BOOKID")+"\t");
			System.out.print(rs.getString("BOOKNAME")+"\t");
			System.out.print(rs.getString("PUBLISHER")+"\t");
			System.out.print(rs.getString("PRICE")+"\n");
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
}catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();

}finally {
	 try {
		rs.close();
		stmt.close();
		conn.close();
	} catch (Exception e2) {
		// TODO: handle exception
	}
}
}


}

