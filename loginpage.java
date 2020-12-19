import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginpage extends HttpServlet {
        
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        
        PrintWriter out=res.getWriter();
        
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        
        if(name.equals("princyy") && password.equals("anghan"))
        {
            RequestDispatcher rd=req.getRequestDispatcher("welcome");
            rd.forward(req,res);
        }
        else
        {
            out.println("<p><h1>Incorrect name and password</h1></p>");
            RequestDispatcher rd=req.getRequestDispatcher("/login.html");
            rd.include(req, res);
        }
    }
    
}
