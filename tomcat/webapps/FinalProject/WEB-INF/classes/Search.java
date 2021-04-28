// Get the data from the HTML text box
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Search extends HttpServlet
{
public void doGet (HttpServletRequest req, HttpServletResponse res) 
throws ServletException, IOException
           {   doPost(req, res);  }

public void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException
 {
  res.setContentType("text/html");
  PrintWriter  msg = res.getWriter();
  msg.println("<HTML> <HEAD> <TITLE>");
  msg.println("Search </TITLE> </HEAD> <BODY>");
// get all parameters
  Enumeration  formdata = req.getParameterNames();
  String PARAM = "";
  String formData = "";
  while (formdata.hasMoreElements())
        {
        PARAM = (String) formdata.nextElement();
        msg.println(PARAM + ": " + req.getParameter(PARAM) + " @" new Date().toString());
        msg.println("<BR>");
        formData = formData + PARAM + ": " + req.getParameter(PARAM) + "\n";
        } // while
  msg.println("</BODY> </HTML>");
// Append the form data to "myFile".
   BufferedWriter outFile = new BufferedWriter(new FileWriter("myFile", true));
   outFile.write(formData);
   outFile.close();
 } // doPost
} // Search

