package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBd {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/Pessoas";
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL,USER,PASSWORD);
	}
}
