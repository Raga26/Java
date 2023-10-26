<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String url = "jdbc:mysql://localhost:3306/tests";
String userName = "root";
String password = "Welcome1";
String query = "select * from test_sample";

Class.forName("com.mysql.jdbc.Driver");

Connection object = DriverManager.getConnection(url ,userName,password);

Statement st = object.createStatement();
ResultSet rs = st.executeQuery(query);

rs.next();
out.println(rs.getString("name"));
%>
</body>
</html>