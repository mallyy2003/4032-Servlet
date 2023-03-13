import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet {

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Student Data";
      String docType ="<!doctype html>\n";
      String value=request.getParameter("RegValue");
      String resultname="";
      Integer resultrank=0;
        
        Student1[] arr;
t
        arr = new Student1[8];

        arr[0] = new Student1(4020, "ppp",8);
        arr[1] = new Student1(4021, "ooo",7);
        arr[2] = new Student1(4022, "nnn",6);
        arr[3] = new Student1(4023, "mmm",5);
        arr[4] = new Student1(4024, "lll",4);
        arr[5] = new Student1(4025, "zzz",3);
        arr[6] = new Student1(4026, "yyy",2);
        arr[7] = new Student1(4027, "xxx",1);
        for(int i=0;i<arr.length;i++){
            if(arr[i].id==Integer.parseInt(value)){
                  resultname=arr[i].name;
                  resultrank=arr[i].rank;
                  break;
         }

        }


        
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n"+"<style>table, td, th { border: 1px solid black;} table {border-collapse: collapse;} </style>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +
               "<center><h1 align = \"center\">" + title + "</h1>\n" +
               "<table>"+   
               "<thead><th>Student Reg No</th><th>Student Name</th><th>Student Rank</th></thead>\n"+
               "<tbody><tr><td>"+value+"</td><td>"+resultname+" </td><td>"+resultrank+" </td> </tr></tbody>"+
            "</table>"+"</body>"+            
        "</html>"
      );
   }

   public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      doGet(request, response);
   }
   class Student1 {
 
      public int id;
      public String name;
      public int rank;

      Student1(int id, String name,int rank)
      {
          this.id = id;
          this.name = name;
          this.rank=rank;
      }
   
}
}