// Get the data from the HTML text box
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class Retrieve extends HttpServlet
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
  msg.println("My Journal</TITLE> </HEAD> <BODY>");
  msg.println("<h1>My Journal History</h1>");
   BufferedReader inFile = new BufferedReader(new FileReader("FinalProject"));
   String line;
   while ((line = inFile.readLine()) != null){
      StringTokenizer st = new StringTokenizer(line, "@");
      msg.println("<p><span style='color:blue;'>"+st.nextToken("@")+":</span><span>"+st.nextToken("@")+"</span></p>");

   }
   inFile.close();
   msg.println("</BODY> </HTML>");
 } // doPost
} // Retrieve

