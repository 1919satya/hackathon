<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="3">
		<tr>
			<th>CustId</th>
			<th>ItemId</th>
			<th>LoanId</th>
			<th>Applied On</th>
			<th>Status</th>
			<th>AppliedAmount</th>
			<th>ApprovedAmount</th>
		</tr>
		<c:forEach var="obj" items="${csl}">
			<tr>
				<td>${obj.cust_id}</td>
				<td>${obj.item_id}</td>
				<td>${obj.loan_id}</td>
				<td>${obj.applied_on}</td>
				<td>${obj.status}</td>
				<td>${obj.appliedAmount}</td>
				<td>${obj.approvedAmount}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>