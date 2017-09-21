import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DBConnection.loginConnection;
import Parking.ParkerInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EnterParkingData extends HttpServlet {

    private ParkingConnection newConn;

    public EnterParkingData() {
    	super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String car_rego = request.getParameter("car_rego");
		String park_address = request.getParameter("park_address");
		String day = request.getParameter("day");
		String start_time = request.getParameter("start_time");
		String end_time = request.getParameter("end_time");;
		String is_handicapped = request.getParameter("is_handicapped");;
		String handicapped_spot = request.getParameter("handicapped_spot");
		String fees_paid = request.getParameter("fees_paid");
		String hours_parked;
		String fees_owed;
		String parked_illegally;
		
		try {
			newConn = new ParkingConnection();
			
			if ( car_rego = null || park_address = null || day = null || start_time = null | end_time = null || is_handicapped = null || handicapped_spot = null || fees_paid = null ) {
				response.sendRedirect("dataEntryFailed.jsp");
			}
			else {
			hours_parked = end_time - start_time;
			fees_owed = hours_parked * 1.5;
			if (hours_parked > 2 && day != "Sunday" || fees_owed > fees_paid && day != "Saturday" || ((start_time < 9 || end_time > 16) && (day != "Saturday" || day != "Sunday"))) {
				parked_illegally = "Yes";
			}
			
			PreparedStatement myStmt = null;
			myStmt = newConn.prepareStatement("insert into parking_info"
					+ " (car_rego, park_address, day, start_time, end_time, hours_parked, is_handicapped, handicapped_spot, fees_owed, fees_paid, parked_illegally)"
					+ " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			
			try {
				myStmt.setString(1, car_rego);
				myStmt.setString(2, park_address);
				myStmt.setString(3, day);
				myStmt.setString(4, start_time);
				myStmt.setString(5, end_time);
				myStmt.setString(6, hours_parked);
				myStmt.setString(7, is_handicapped);
				myStmt.setString(8, handicapped_spot);
				myStmt.setString(9, fees_owed);
				myStmt.setString(10, fees_paid);
				myStmt.setString(11, parked_illegally);
				myStmt.executeUpdate();			
			}
			finally {
				newConn.close();
			}
		}
			response.sendRedirect("dataEntered.jsp");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
