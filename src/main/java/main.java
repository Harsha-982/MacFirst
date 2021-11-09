import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class main extends HttpServlet {
   public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
       PrintWriter pw=response.getWriter();
       pw.println("hi");
   }
}
