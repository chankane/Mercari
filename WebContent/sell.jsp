<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./SellServlet">
		<table>
			<tr>
				<th>Name:</th>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<th>Price:</th>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<th>Description:</th>
				<td><textarea name="description" rows="4"></textarea></td>
			</tr>
			<tr>
				<th>Image:</th>
				<td><input type="text" name="image_path" /></td>
			</tr>
		</table>
		<input type="submit" value="Sell" />
	</form>
</body>
</html>