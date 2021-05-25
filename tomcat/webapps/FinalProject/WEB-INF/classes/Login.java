import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Login extends HttpServlet
{
public void doGet (HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException
           {   doPost(req, res);  }

public void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
 {
  res.setContentType("text/html");
  PrintWriter msg = res.getWriter();
  msg.println("<h3>Hello " + req.getParameter("Username") + " !<h3>");

  BufferedWriter outFile = new BufferedWriter(new FileWriter("../webapps/FinalProject/WEB-INF/Login.txt"));
  String formData = "";
  formData+=req.getParameter("Username")+"\n" +req.getParameter("Password");
  outFile.write(formData);
  outFile.close();
 } // doPost
} 