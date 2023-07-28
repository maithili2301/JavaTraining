


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class UpdateTest {
  public static void main(String[] args) {
	try {
		System.out.println("Trying to load driver.....");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver load...");
		System.out.println("Trying to connect...");
		Connection conn =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		System.out.println("Connected : "+conn);
		String sqlQuery="UPDATE MYDEPT120 " + "SET LOC = ? " + "WHERE DEPTNO = ?";
		
		PreparedStatement pst=conn.prepareStatement(sqlQuery);
		
	
		
		pst.setInt(2, 120);
		pst.setString(1, "Pimpri");
		System.out.println("Prepared statement is connected.."+pst);
        int rows =pst.executeUpdate();
        System.out.println("Rows updated "+ rows);
	    Statement statement=conn.createStatement();
		ResultSet result5=statement.executeQuery("Select  * from MYDEPT120");
		while(result5.next()) {
			System.out.println("DEPTNO : "+result5.getInt(1));
			System.out.println("DNAME  : "+result5.getString(2));
			System.out.println("LOC    : "+result5.getString(3));
			System.out.println("-------------");
		}
		
		conn.close();
		System.out.println("Disconnected : "+conn);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


