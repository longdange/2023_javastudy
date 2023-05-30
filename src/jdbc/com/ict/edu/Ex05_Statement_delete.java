package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statement_delete {
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
		
		String sql="delete from customer where name='이강인'";
		stmt=conn.createStatement();
		result=stmt.executeUpdate(sql);
		if(result>0) {
			sql="select * from customer order by custid asc";
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
			}
		}else {
			System.out.print("삭제 실패");
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
