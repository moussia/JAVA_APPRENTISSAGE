<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bonjour</title>
</head>
<body>
<p>test bonjour a vous ! </p>
<%@ include file="menu.jsp" %>
<p>
	Bonjour ${ auteur.prenom } ${auteur.name} 
	${auteur.actif ? 'Je suis actif' : "pas actif" }
 </p>

<p>
</p>
 
</body>
</html>