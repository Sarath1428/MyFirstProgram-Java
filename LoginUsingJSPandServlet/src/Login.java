

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Uname = request.getParameter("Uname");
		String Pass = request.getParameter("pass");
		LoginDAO dao = new LoginDAO();
		
		if(dao.check(Uname,Pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", Uname);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("Login.jsp");
		}
		
	}

}
