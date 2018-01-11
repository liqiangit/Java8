package chap38.listing03;

<html> 
<body> 
<center> 
<form name="Form1" 
  method="post" 
  action="http://localhost:8080/examples/servlets/servlet/PostParametersServlet"> 
<table> 
<tr> 
  <td><B>Employee</td> 
  <td><input type=textbox name="e" size="25" value=""></td> 
</tr> 
<tr> 
  <td><B>Phone</td> 
  <td><input type=textbox name="p" size="25" value=""></td> 
</tr> 
</table> 
<input type=submit value="Submit"> 
</body> 
</html>

import java.io.*; 
import java.util.*; 
import javax.servlet.*; 
 
public class PostParametersServlet  
extends GenericServlet { 
 
  public void service(ServletRequest request,  
    ServletResponse response)  
  throws ServletException, IOException { 
 
    // Get print writer. 
    PrintWriter pw = response.getWriter(); 
 
    // Get enumeration of parameter names. 
    Enumeration<String> e = request.getParameterNames(); 
 
    // Display parameter names and values. 
    while(e.hasMoreElements()) { 
      String pname = e.nextElement(); 
      pw.print(pname + " = "); 
      String pvalue = request.getParameter(pname); 
      pw.println(pvalue); 
    } 
    pw.close(); 
  } 
}
