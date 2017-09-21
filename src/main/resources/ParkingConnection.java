
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ParkingConnection {
	private Connection myConn;
	private StringBuilder list;
	
	public ParkingConnection() throws Exception {		
	    String hostName = "localhost";
		String user = "root";
		String password = "1234";
		String dbName = "parking_info";
		String dburl = "jdbc:mysql://" + hostName + ":3306/" + dbName + "?autoReconnect=true&useSSL=false";;
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		myConn = DriverManager.getConnection(dburl, user, password);
		System.out.println("Successful connection to: " + dburl);
	}
}
