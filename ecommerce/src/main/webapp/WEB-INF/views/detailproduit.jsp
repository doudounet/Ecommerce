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
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">

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
			<li><a href="utilisateurs">Liste des Utilisateurs </a></li>

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
                    <div class="container-fluid">
			<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>Modification d'une commande</legend>
				<div class="row-fluid">
				<form:form class="form-horizontal" method="post" modelAttribute="produit" action="valider">
				<form:errors path="*" cssStyle="color : red;"/>
					<div class="control-group">
					<div class="row">
					<div class="col-md-3">
						<label class="control-label">Numéro de commande: </label>
					  </div>
					<div class="col-md-9">
						<form:input type="text" path="id" style="width:500px;"/>	
					</div>
					</div>
					<div class="row">
					<div class="col-md-3">
						<label class="control-label"> Libéllé : </label>
						</div>
					<div class="col-md-9">
						<form:input type="text" path="libelle" style="width:500px;"/>	
					</div>
					</div>
						
					</div>
					<div class="control-group">
					<div class="row">
					<div class="col-md-3">
						<label class="control-label">Date de début: </label>
					</div>
					<div class="col-md-6">
						<form:input type="text" path="datedebut" style="width:500px;" />	
					</div>
					</div>	
					</div>
					<div class="control-group">
					<div class="row">
					<div class="col-md-3">
						<label class="control-label"> Date de fin: </label>
						</div>
						<div class="col-md-6">
						<form:textarea rows="4" path="datefin" />
						</div>
					</div>
					</div>
					<div class="control-group">
					<div class="row">
					<div class="col-md-3">
						<label class="control-label"> Dernière modifcation: </label>
						</div>
						<div class="col-md-6">
						<form:textarea rows="4" path="personnemaj" />
						</div>
					</div>
					</div>
                  
					<div class="row">
					<div class="col-md-3">
						<label class="control-label"> Statut : </label>
					  </div>
					<div class="col-md-9">
						<form:input type="text" path="type" style="width:500px;"/>	
					</div>
					</div>	
					</div>
				<br />
					<div class="form-actions">
						<button type="submit" name = "btn btn-success" class="btn btn-success" > Valider </button>
					
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