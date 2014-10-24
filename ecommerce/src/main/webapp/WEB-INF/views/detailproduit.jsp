<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Détail</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet">
	

</head>
<body>
	<div class="container">

		<nav class="navbar navbar-inverse">
		<ul class="nav navbar-nav">
			<li class="active"><a href="#"></a>
			</li>
			<li class="active"> <a href="#"> Bienvenue, ${displayname} !</a></li>
			<li><a href="logout">Deconnexion</a></li>
			<li><a href="rechercheproduit">Liste des produits</a></li>

		</ul>
		<form class="navbar-form pull-right">
			<input type="text" style="width: 150px" class="input-small"
				placeholder="Recherche">
			<button type="submit" class="btn btn-primary btn-xs">
				<span class="glyphicon glyphicon-eye-open"></span> Chercher
			</button>
		</form>
		</nav>
	</div>
	

<div class="container">
    <div class="col-md-12">
        <div class="center-block text-center">
            <h4> Interface de modification d'un produit </h4>
      
        </div>
        <div class="container">
            <div class="menu row">
                <div class="product col-sm-10">
					<hr>
                    <h2>Nom</h2>
                    <div class="container-fluid">
			<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>Modification d'un produit </legend>
				<div class="row-fluid">
				<form:form class="form-horizontal" method="post" >
				<form:errors path="*" cssStyle="color : red;"/>
					<div class="control-group">
						<label class="control-label"> Nom du produit : </label>
						
						<input type="text" value='<%= request.getAttribute("nomProduit") %>' style="width:500px;"/>	
						
					</div>
					<div class="control-group">
						<label class="control-label"> Prix </label>
						<div class="controls">
							
							
						</div>
					</div>
					
						<div class="control-group">
						<label class="control-label"> Description </label>
						<div class="controls">
							
							
						</div>
					</div>
				<br />
					<div class="form-actions">
						<button type="submit" name = "btn btn-success" class="btn btn-success"> Modifier </button>
					
					</div>
				</form:form>	
				</div>
				</fieldset>
			
				
			 <br />
			 <br />
			 
				
			</div>
		</div>
	</div>		
                   
                  
                  
                    
                </div>
               
            </div>
            
            	
            <!--/row-->
        </div>
        <!--/container-->
    </div>
    </div>




</body>
</html>