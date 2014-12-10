import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This program demonstrates making JDBC connection to a SQLite database.
 * 
 * @author www.codejava.net
 * 
 */

public class Connection_Check extends salute{

	public static void main(String[] args) {
		try {
			Class.forName("org.sqlite.JDBC");
			String dbURL = "jdbc:sqlite:product.sqlite";
			Connection conn = DriverManager.getConnection(dbURL);
			if (conn != null) {
				System.out.println("Connected to the database");
				DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
				System.out.println("Driver name: " + dm.getDriverName());
				System.out.println("Driver version: " + dm.getDriverVersion());
				System.out.println("Product name: " + dm.getDatabaseProductName());
				System.out.println("Product version: " + dm.getDatabaseProductVersion());
				Statement st = conn.createStatement();
				System.out.println("Connection_Check.main()");
				System.out.println("Connection_Check.main()");
				//st.execute("Create table ASIM;");
				conn.close();
				Connection_Check cn = new  Connection_Check();
				cn.Dohello();
				//cn.doSome();

			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void doSome()
	{
		System.out.println("Hello in Child ");
	}
	public void Dohello()
	{
		this.doSome();
		super.doSome();
	}
}