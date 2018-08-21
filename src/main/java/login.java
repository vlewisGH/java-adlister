import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login", urlPatterns = "/login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String userName = req.getParameter("username");
        String passWord = req.getParameter("password");

        if(checkAuth(userName,passWord)){
            res.sendRedirect("/profile.jsp");
        }else{
            String errMessage = "Your user or password is incorrect";
            res.sendRedirect("/login.jsp/?message="+errMessage);
        }
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.sendRedirect("/login.jsp");
    }

    public boolean checkAuth(String user, String pass){
        return (user.equals("admin") && pass.equals("password"));
    }
}
