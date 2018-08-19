<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<table>
		<tr>
			<td>Welcome ${user.name}</td>
			<td>balance: ${user.balance}</td>
			<td><a href="sell.jsp">Sell</a></td>
			<td><a href="./SignOutServlet">Sign out</a></td>
		</tr>
	</table>
</body>
</html>