// Get the data from the HTML text box
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Save extends HttpServlet
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
  msg.println("My Journal </TITLE> </HEAD> <BODY>");
// get all parameters
  Enumeration  formdata = req.getParameterNames();
  String PARAM = "";
  String formData = "";
  while (formdata.hasMoreElements())
        {
        String date=new Date().toString();
        PARAM = (String) formdata.nextElement();
        msg.println("<h2>Your thought is saved!</h2>");
        msg.println("<span style='color:blue;'>"+date + ": </span>" + req.getParameter(PARAM));
        msg.println("<BR>");
        formData = formData + date + "@ " + req.getParameter(PARAM) + "\n";
        } // while
  msg.println("</BODY> </HTML>");
// Append the form data to "FinalProject" file.
   BufferedWriter outFile = new BufferedWriter(new FileWriter("FinalProject", true));
   outFile.write(formData);
   outFile.close();
 } // doPost
} // Search