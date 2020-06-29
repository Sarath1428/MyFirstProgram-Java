

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Uname = request.getParameter("Username");
		String Pass = request.getParameter("password");
		
		RegistrationDAO obj = new RegistrationDAO();
		obj.insert(Uname, Pass);
		
		response.sendRedirect("AboutUs.jsp");
		
		
		
		
	}

}
