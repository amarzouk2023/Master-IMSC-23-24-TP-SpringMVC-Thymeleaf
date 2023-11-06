<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div>
		<form:form action="addProduct" modelAttribute="product" method="POST">
			<form:label path="titre">Titre</form:label>
			<form:input path="titre" />
			<form:label path="prix">Prix</form:label>
			<form:input path="prix" />
			<input type="submit" value="Submit" />
		</form:form>
	</div>
	<br />
	<br /> Go back to
	<a href="products">List of All Products</a>
</body>
</html>