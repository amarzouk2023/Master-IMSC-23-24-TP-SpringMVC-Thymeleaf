<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste des produits</title>
</head>
<body>
	

	<div>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Price</th>
			</tr>
			<c:forEach var="product" items="${products}">
				<tr>
					<td>${product.id}</td>
					<td>${product.titre}</td>
					<td>${product.prix}</td>
					<td><a href="deleteProduct/${product.id}">Delete</a></td>
					<td><a href="editProduct/${product.id}/">Edit</a>
				</tr>
			</c:forEach>
		</table>
	</div>

<br />
	<br /> Ajouter un nouveau produit
	<a href="ajoutProductForm">new Product</a>
</body>
</html>
