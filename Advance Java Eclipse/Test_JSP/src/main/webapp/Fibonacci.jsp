<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fibonacci</title>
</head>
<body>

 <%
    int n1 = 0, n2 = 1, n3, i, count = 10;
    // Printing first two Fibonacci numbers
    out.print(n1 + " " + n2);

    // Loop to print the next elements of the Fibonacci series
    for(i = 2; i < count; ++i) {
        n3 = n1 + n2;
        out.print(" " + n3);
        n1 = n2;
        n2 = n3;
    }
%>
</body>
</html>