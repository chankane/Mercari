<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>Name:</th>
			<td>${item.name}</td>
		</tr>
		<tr>
			<th>Price:</th>
			<td>${item.price}</td>
		</tr>
		<tr>
			<th>Description:</th>
			<td>${item.description}</td>
		</tr>
		<tr>
			<th>Image:</th>
			<td>${item.imagePath}</td>
		</tr>
		<tr>
			<th>Seller:</th>
			<td>${item.sellerId}<td>
		</tr>
	</table>
	<form action="./BuyServlet">
		<input type="submit" value="Buy" />
	</form>
</body>
</html>