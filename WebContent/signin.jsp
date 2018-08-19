<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./SignInServlet">
		<table>
			<tr>
				<th>E-mail:</th>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Sign in" />
	</form>
</body>
</html>