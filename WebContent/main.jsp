<%@page import="pkg.servlet.AttributeManager"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body onload="<%AttributeManager.setItems(session);%>">
	<jsp:include page="header.jsp" />
	<form action="detail.jsp">
		<table border="1">
			<tr>
				<th>Name:</th>
				<th>Picture:</th>
				<th>Price:</th>
				<th></th>
			</tr>
			<c:forEach var="item" items="${items}">
				<tr>
					<td>${item.name}</td>
					<td>${item.imagePath}</td>
					<td>${item.price}</td>
					<td>
						<input type="submit" value="detail" />
						<%-- <%AttributeManager.set%> --%>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>