package Java_AdvanceTraining_Day6_Wipro;

import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

res.setContentType("text/html");

HttpSession session = req.getSession();

System.out.println("Session id:" + session.getId());

PrintWriter pw=res.getWriter();

pw.write(s:"<html><body>");

pw.write(s:"<h1 style=\"color:blue\"> Hello, Welcome to the land of servlets.. </h1>");

pw.write(s:"</html></body>");

}

}

public class Servlet {

}
