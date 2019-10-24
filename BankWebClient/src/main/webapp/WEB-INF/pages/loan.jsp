<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<h1>Apply Loan</h1>
	
	<h1>${message}</h1>
	<form action="/fetchOffers">
		<table>
			<tr>
				<th>Loan Amount</th>
				<td><input type="text" name="loanamount" /></td>
			</tr>
			<tr>
				<th>Area Code</th>
				<td><input type="text" name="area_code"></td>
			</tr>
			<tr>
				<th>Area Size</th>
				<td><input type="text" name="area_size"></td>
			</tr>
			<tr>
				<th>Legal Residence</th>
				<td><input type="text" name="legal_residence"></td>
			</tr>
			<tr>
				<th>CreditScore</th>
				<td><input type="text" name="credit_score"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Apply"></td>
			</tr>
		</table>
	</form>

</body>
</html>