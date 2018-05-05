package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLUtils {
	private static Connection conn=null;

	public static String GetSQLData(String SQLQuery) throws SQLException{
		String data=null;
		conn=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Aprilautomation","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(SQLQuery);
		if(rs.next()){
			data = rs.getString(1);

		}
		conn.close();
		return data;
	}

	public static void SetSQLData(String SQLQuery) throws SQLException{
		conn=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/Aprilautomation","root","root");
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(SQLQuery);
		conn.close();
	}

}


