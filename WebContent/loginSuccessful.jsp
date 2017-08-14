<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ILogin page</title>
</head>
<body>
<% 
String username= session.getAttribute("user").toString();
%>
welcome <%=username %> to this site.
<form action="LogoutServlet" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>