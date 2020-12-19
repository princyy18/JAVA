import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class welcome extends HttpServlet {
    
    public void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException {
        
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        
        PrintWriter out=res.getWriter();
        
        
        out.println("welcome to the world");
        out.println("your name is superb "+ name);
    }
  
}
