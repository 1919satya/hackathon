<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Offers</title>
<link rel="stylesheet" href="/css/form.css" type="text/css" />
</head>
<body>
	<div id="registration-form">
		<div id="formHeader">
			<h5>Suggested Loan Project</h5>
		</div>
	<form action="/applyloan">
		<table border="3">
			<tr>
				<th>CustomerID</th>
			    <th>Loan ID</th>
				<th>Loan Amount</th>
				<th>Loan Item Name</th>
				<th>      </th>
			</tr>
			<tr>
				<td><input type="text" value="${cust_id}"></input></td>
				<td><input type="text" value="${Item.loan_id}"></input></td>
				<td><c:out value="${Item.amount}"></c:out></td>
				<td><c:out value="${Item.item_name }"></c:out></td>
				<td><input type="checkbox"></input></td>			
			</tr>
	
		<tr><td><div class="formDivs"><input type="submit" value="Apply" /></td></div></tr>
		</table>
	</form>
	</div>
</body>
</html>