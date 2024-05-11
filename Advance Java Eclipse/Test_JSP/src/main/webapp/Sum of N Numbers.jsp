<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sum of N Numbers</title>
</head>
<body>

<h1>Sum of n Numbers</h1>
    
    <form method="post">
        Enter the value of n: <input type="text" name="n"><br><br>
        
        <% 
            String nStr = request.getParameter("n");
            if (nStr != null && !nStr.isEmpty()) {
                int n = Integer.parseInt(nStr);
                int sum = 0;
                
                for (int i = 1; i <= n; i++) {
        %>
                Enter number <%= i %>: <input type="text" name="number<%= i %>"><br>
        <%
                }
        %>
                <input type="submit" value="Calculate Sum">
        <% } %>
    </form>
    
    <%
        if (nStr != null && !nStr.isEmpty()) {
            int n = Integer.parseInt(nStr);
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                String numberStr = request.getParameter("number" + i);
                if (numberStr != null && !numberStr.isEmpty()) {
                    int num = Integer.parseInt(numberStr);
                    sum += num;
                }
            }
    %>
    
    <p>The sum of the <%= n %> numbers is: <%= sum %></p>
    
    <% 
    } 
    %>

</body>
</html>