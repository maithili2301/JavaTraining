
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SelectTest {
  public static void main(String[] args) {
	try {
		System.out.println("Trying to load driver.....");
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		System.out.println("Driver load...");
		System.out.println("Trying to connect...");
		Connection conn =DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
		System.out.println("Connected : "+conn);
		
		Statement statement=conn.createStatement();
		
		System.out.println("Statement created...."+statement);
	ResultSet result=statement.executeQuery("insert into mydept120 values (17,'TECH','Pune')");
//	ResultSet result2=statement.executeQuery("delete from mydept120 where DEPTNO=17");
		ResultSet result1=statement.executeQuery("Select  * from MYDEPT120");
		while(result1.next()) {
			System.out.println("DEPTNO : "+result1.getInt(1));
			System.out.println("DNAME  : "+result1.getString(2));
			System.out.println("LOC    : "+result1.getString(3));
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
