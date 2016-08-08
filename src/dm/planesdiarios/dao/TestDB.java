package dm.planesdiarios.dao;
import java.sql.*;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
public class TestDB {
	static Logger log = Logger.getLogger(TestDB.class);
public static void main(String[] args) {
	BasicConfigurator.configure();
	log.debug("Init Application");	
		// Create a variable for the connection string.
	String connectionString =  
            "jdbc:sqlserver://donmario.database.windows.net:1433;"  
            + "database=PRODUCCION;"  
            + "user=admin_donmario@donmario;"  
            + "password=AzcD130ZenT;"  
            + "Encrypt=true;"  
            + "trustServerCertificate=false;"  
            + "hostNameInCertificate=*.database.windows.net;"  
            + "loginTimeout=30;";
	//Server=tcp:MyDBServer.database.secure.windows.net,1433;Database=DemoDB;User ID=Srisail@MyDBServer;Password=password123%;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;
		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
        	try {
        		// Establish the connection.
        		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            		con = DriverManager.getConnection(connectionString);
            
            		// Create and execute an SQL statement that returns some data.
            		String SQL = "SELECT TOP 10 * FROM Person.Contact";
            		stmt = con.createStatement();
            		rs = stmt.executeQuery(SQL);
            
            		// Iterate through the data in the result set and display it.
            		while (rs.next()) {
            			System.out.println(rs.getString(4) + " " + rs.getString(6));
            		}
        	}
        
		// Handle any errors that may have occurred.
		catch (Exception e) {
			log.debug(e.getMessage());
			e.printStackTrace();
			log.debug(e.getStackTrace());
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
	    		if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	    		if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
