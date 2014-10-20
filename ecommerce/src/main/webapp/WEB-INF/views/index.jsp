<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html"%>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3c.org/1999/xhtml" 
	xmlns:jsp="http://java.sun.com/JSP/Page" 
	xmlns:th="http://www.thymeleaf.org" 
	xmlns:c="http://java.sun.com/jsp/jstl/core">
    
    <head>
    	<script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js'></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Identification</title>
      <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" >
         <script type='text/javascript'>
   function divaffiche(){ 
	document.getElementById("demandepwd").style.display = "block"; 
   	document.getElementById("pwdforgotten").style.display = "none"; 
   	 
   	} 
   
   function divhidden(){ 
		document.getElementById("demandepwd").style.display = "none"; 
		document.getElementById("pwdforgotten").style.display = "none"; 
	   	 
	   	} 
  
  </script>
    </head>
    
   <body>
   
   

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span12">
				<fieldset>
				<legend>Connexion E-commerce </legend>
				<form class="form-horizontal" method="get" action="login" name="loginForm" id="loginForm" commandName="user">
					<div class="control-group">
						<label class="control-label"> Utilisateur </label>
						<div class="controls">
							<input type="text" name="utilisateur" path="utilisateur" title="Utilisateur" value=""/>
							<%-- <form:errors path="login" cssStyle="color:#ff0000"/> --%>
						</div>
					</div>
					<div class="control-group">
						<label class="control-label"> Mot de Passe </label>
						<div class="controls">
							<input type="text" name="password" path="password" title="Mot de Passe" value=""/>
							<!-- <form:errors path="password" cssStyle="color:#ff0000"/> -->
						</div>
					</div>
				<br />
					<div class="form-actions">
						<button type="submit" name = "btn btn-success" class="btn btn-success"> Se connecter </button>
						<button type="button" id="pwdforgotten" class="btn btn-info" onClick="divaffiche()"> Mot de passe oublié </button>
					</div>
				</form>	
				</fieldset>
			
				
			 <br />
			 <br />
			 
				
				<div id="demandepwd" class="bg-warning" style="display:none;">
				
					<form class="form-horizontal"  name="resetPasswordForm" id="resetPasswordForm">
						<div class="control-group">
							<label class="control-label"> E-Mail </label>
								<div class="controls">
									<input type="text" name="email" id="email" title="E-mail" value="">
								</div>
						</div>
				<br />
					Vous allez recevoir par courrier électronique la procédure pour changer votre mot de passe.
				<br />
				<br />
						<div class="form-actions">
							<button type="submit" class="btn btn-warning" onclick="divhidden()"> Demander un nouveau mot de passe </button>
						<br />
						</div>
					
					</form>
					
				</div>
				
			</div>
		</div>
	</div>		
</body>
</html>
