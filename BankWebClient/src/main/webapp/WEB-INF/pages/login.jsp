<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/css/form.css" type="text/css" />

</head>
<body>

	<div id="registration-form">
		<c:out value="${error}"></c:out>

		<form action="/user/authenticate">
			<div id="formHeader">
				<h5>SignUp</h5>
			</div>
			
				<table>
					<tr>
						<td><input type="text" name="username" required placeholder="Username"></td>
					</tr>
					<tr>
						<td><input type="password" name="password" id="password" required  placeholder="Password"></td>
					</tr>
					<tr>
						<td><div  class="formDivs"><input type="submit" value="Submit" /></div></td>
					</tr>
				</table>
		</form>
		<a href="/register">Register</a>
	</div>
</body>
</html>