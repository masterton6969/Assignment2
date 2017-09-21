<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Parking Data</title>
</head>
<body>
<h2>Enter your Information:</h2>
	<form method="post" action="EnterParkingData">
		<table>
			<tr>
				<td> Car Registration #:</td>
				<td><input type="text" name ="car_rego"></td>
			</tr>
			<tr>
				<td> Parking Address:</td>
				<td><input type="text" name ="park_address"></td>
			</tr>
			<tr>
				<td> Day (e.g. Monday):</td>
				<td><input type="text" name ="day"></td>
			</tr>
			<tr>
				<td> Hour You Parked (e.g. 13 for 1:26pm, rounded down):</td>
				<td><input type="text" name ="start_time"></td>
			</tr>
			<tr>
				<td> End Time (e.g. 14 for 1:36pm, rounded up):</td>
				<td><input type="text" name ="end_time"></td>
			</tr>
			<tr>
				<td> Handicapped permit? (Y or N)</td>
				<td><input type="text" name ="is_handicapped"></td>
			</tr>
			<tr>
				<td> Handicapped spot? (Y or N):</td>
				<td><input type="text" name ="handicapped_spot"></td>
			</tr>
			<tr>
				<td> Fees paid (e.g. 2.5 for $2.50):</td>
				<td><input type="text" name ="fees_paid"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name ="Enter"></td>
			</tr>
		</table>
	</form>
</body>
</html>