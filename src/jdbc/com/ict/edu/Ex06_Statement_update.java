package jdbc.com.ict.edu;
//박세리의 주소를 대한민국 제주도,전화번호

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06_Statement_update {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	int result=0;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="c##jiho";
		String password ="1111";
		conn=DriverManager.getConnection(url,user,password);
		
		String sql= "update customer set address='대한민국 제주도',phone='000-9000-0001'"
				+ "where name='박세리2'";
		stmt=conn.createStatement();
		result=stmt.executeUpdate(sql);
		if(result>0) {
			sql="select * from customer order by custid";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
		}else {
			System.out.print("삭제 실패");
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\n");
		}
	} catch (Exception e) {
	}finally {
		try {
			rs.close();
			stmt.close();
			conn.close();
		}
		 catch (Exception e) {
			// TODO: handle exception
		} 
	}
	
}

}

