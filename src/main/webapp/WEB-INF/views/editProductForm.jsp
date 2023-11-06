<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div>
		<form:form action="${pageContext.request.contextPath}/updateProduct" modelAttribute="product" method="POST">
			<form:label path="id">ID</form:label>
			<form:input path="id" type="hidden"/>
			<form:label path="titre">Titre</form:label>
			<form:input path="titre"  />
			<form:label path="prix">Prix</form:label>
			<form:input path="prix" />
			<input type="submit" value="Update" />
		</form:form>
	</div>
	
	<br/>
	<br/>
	Go back to <a href="${pageContext.request.contextPath}/products">List of All Products</a>
</body>
</html>