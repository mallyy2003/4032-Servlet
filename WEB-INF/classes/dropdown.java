import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class dropdown extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Dropdown selection";
      String docType ="<!doctype html>\n";
      String result="Null";
        String value = request.getParameter("DropValue");
        String[] words=new String[]{"one","two","three","four"};
        if(Integer.parseInt(value)<=words.length){
            result=words[Integer.parseInt(value)-1];
        }
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<center><h1 align = \"center\">" + title + "</h1>\n" +
                  "<h2><b>Selcted Value is  </b>: "
                  + result+ "</h2></center>\n" +
            "</body>"+
            
        "</html>"
      );
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
   }
}