package location;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConn {
	private JDBCConn() {

	}

	private static Connection con;
	static {
		String url = "jdbc:postgresql://localhost:5432/MYDB";
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, "postgres", "tiger");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Connection getConnn() {
		return con;
	}
}
