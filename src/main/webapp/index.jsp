<%@ page import="java.util.Date" %>
<html>
<body>

<h2><%= "Hello World!" %></h2>

<%
  Date date = new Date();
%>

<h2>Benvenuto Utente Curioso, questo � la mia prima JSP. Oggi � il giorno "<%= date %>" Autore: <a href="http://localhost:6127/author.jsp"> link </a></h2>
</body>
</html>
