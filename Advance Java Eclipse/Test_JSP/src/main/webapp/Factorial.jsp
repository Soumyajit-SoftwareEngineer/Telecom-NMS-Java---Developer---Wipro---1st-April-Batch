<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Factorial using Declarative and Scriptlet tags </h1>

<%!
int factorial(int n){
	int fact =1;
	for(int i =1; i <=n; ++i)
		fact = fact * i;
	return fact;
}
%>
<%
int result = factorial(5);
out.println("Factorial of 5 is : "+ result);
%>

</body>
</html>