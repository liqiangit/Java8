package chap38.listing9;

<html> 
<body> 
<center> 
<form name="Form1"  
  method="post" 
  action="http://localhost:8080/examples/servlets/servlet/AddCookieServlet"> 
<B>Enter a value for MyCookie:</B> 
<input type=textbox name="data" size=25 value=""> 
<input type=submit value="Submit"> 
</form> 
</body> 
</html>

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class AddCookieServlet extends HttpServlet { 
 
  public void doPost(HttpServletRequest request,  
    HttpServletResponse response)  
  throws ServletException, IOException { 
 
    // Get parameter from HTTP request. 
    String data = request.getParameter("data"); 
 
    // Create cookie. 
    Cookie cookie = new Cookie("MyCookie", data); 
 
    // Add cookie to HTTP response. 
    response.addCookie(cookie); 
 
    // Write output to browser. 
    response.setContentType("text/html"); 
    PrintWriter pw = response.getWriter(); 
    pw.println("<B>MyCookie has been set to"); 
    pw.println(data); 
    pw.close(); 
  } 
}
