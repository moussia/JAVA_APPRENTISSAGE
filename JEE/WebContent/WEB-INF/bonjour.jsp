<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tire</title>
</head>
<body>
<p>test bonjour a vous ! </p>
<%@ include file="menu.jsp" %>
<p>
	<%
		String mavariable = (String) request.getAttribute("mavariable");
		out.println(mavariable);
	%>
 </p>

<p>
	<%
	String heure = (String) request.getAttribute("heure");
	if (heure.equals("jour"))
		out.println("Bonjour");
	else
		out.println("Bonsoir");
	%>
</p>
 
</body>
</html>