<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche d'un produit</title>
	<link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">
	<link rel="stylesheet" href="http://cdn.datatables.net/1.10.3/css/jquery.dataTables.min.css" />
	<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.3/css/jquery.dataTables.css">
	<link href="${pageContext.request.contextPath}/resources/DataTables-1.10.3/css/jquery.dataTables.css" rel="stylesheet">
	
	<script type="text/javascript" charset="utf8" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script type="text/javascript" charset="utf8" src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    <script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"</script>
    <script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/tabletools/2.2.3/js/dataTables.tableTools.min.js"</script>
    <script type="text/javascript" charset="utf8" src="http://editor.datatables.net/media/js/dataTables.editor.min.js"</script>
    <script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/plug-ins/725b2a2115b/integration/bootstrap/3/dataTables.bootstrap.js"</script>
    <script type="text/javascript" charset="utf8" src="http://editor.datatables.net/examples/resources/bootstrap/editor.bootstrap.js"</script>
   <script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/resources/DataTables-1.10.3/js/jquery.js"></script> 
 <script type="text/javascript" charset="utf8" src="${pageContext.request.contextPath}/resources//DataTables-1.10.3/js/jquery.dataTables.js"></script> 
</head>
<body>

	<script>
	$(document).ready(function() {
	    $('#tablist').dataTable(
	    		{
	                "bPaginate": false
	            }
	    );
	} );
	
	
	 function voirProduit() {
	        ;
	        id = $("#consult").attr('value');
	      
	    }

	</script>
	<div class="container">

		<nav class="navbar navbar-inverse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#"> ${displayname} </a></li>
			<li><a href="logout">Deconnexion</a></li>
			<li><a href="panier">Panier</a></li>
			<li><a href="panier">Modifier les clients</a></li>

		</ul>

		<form class="navbar-form pull-right">
			<input type="text" style="width: 150px" class="input-small"
				placeholder="Recherche">
			<button type="submit" class="btn btn-primary btn-xs" id="flip">
				<span class="glyphicon glyphicon-eye-open"></span> Chercher
			</button>
		</form>
		</nav>


		<div class="container">
			<div class="col-md-12">
				<div class="center-block text-center">
					<h1>Formation Framework J2EE</h1>
					<p class="lead">Unis - Villeneuve d'Ascq</p>
				</div>
				<div class="container"">

					<div id="panel">
						<div class="col-sm-6">
							<a href="#"><img class="img-responsive"
								src="${pageContext.request.contextPath}/resources/img/logounis.PNG"
								height="450" width="180"><i
								class="btn btn-product fa fa-star"></i></a>
							<hr>
							<h2>Objectifs</h2>
							<p>Ce site permet de faire connaissance avec les principaux
								frameworks utilisés chez UNIS (Spring, Mybatis, Hibernate,
								Maven) et des autres outils (Ajax, jQuery ou encore Bootstrap)</p>
							<hr>
							<hr>


						</div>
						<div class="col-sm-6">
							<div class="productsrow">
								<div class="product menu-category">
									<div class="menu-category-name list-group-item active">An
										open source application framework and inversion of control
										container for the Java platform</div>
									<div class="product-image">
										<img class="product-image"
											src="${pageContext.request.contextPath}/resources/img/spring.jpg"
											height="180" width="540">
									</div>

								</div>




							</div>
						</div>
					</div>
				</div>
				<!--/row-->
			</div>

			<!--/container-->
		</div>

		<div class=resultsearch>
			<form action="detailproduit">

				<table class="table table-striped table-bordered" width="100%" cellspacing="0" id="tablist">

					<thead>

						<tr>
							
							<th> Select </th>
							<th>Produit</th>
							<th>Prix</th>
							<th>Description</th>
							<th></th>
							<th></th>


						</tr>

					</thead>
					<c:forEach var="p" items="${produits}">

						<tbody>

							<tr>



								<td> <input type="checkbox" value="${p.idProduit}" />     </td>
								<td><c:out value="${p.nomProduit}"></c:out></td>
								<td><c:out value="${p.prixUnitaireProduit}"></c:out></td>
								<td><c:out value="${p.shortDescriptionProduit}"></c:out></td>
								<td>
									<button class="btn btn-default btn-xs" id="detail"
										<c:out value="/detail/${p.idProduit}"></c:out>
										<span class="glyphicon glyphicon-search"></span> Détail
									</button>
								</td>
								<td>
									<button class="btn btn-default btn-xs">
										<span class="glyphicon glyphicon-shopping-cart"> </span>
										Ajouter au panier
									</button>
								</td>

							</tr>


						</tbody>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>




</body>
</html>