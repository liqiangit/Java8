package chap38.listing5;

<html> 
<body> 
<center> 
<form name="Form1"  
  action="http://localhost:8080/examples/servlets/servlet/ColorGetServlet"> 
<B>Color:</B> 
<select name="color" size="1"> 
<option value="Red">Red</option> 
<option value="Green">Green</option> 
<option value="Blue">Blue</option> 
</select> 
<br><br> 
<input type=submit value="Submit"> 
</form> 
</body> 
</html>

import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
 
public class ColorGetServlet extends HttpServlet { 
 
  public void doGet(HttpServletRequest request,  
    HttpServletResponse response)  
  throws ServletException, IOException { 
 
    String color = request.getParameter("color"); 
    response.setContentType("text/html"); 
    PrintWriter pw = response.getWriter(); 
    pw.println("<B>The selected color is:  "); 
    pw.println(color); 
    pw.close(); 
  } 
}
