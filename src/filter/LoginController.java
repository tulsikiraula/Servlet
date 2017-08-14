package filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginServlet")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static Map<String ,Integer> token= new HashMap<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username =  request.getParameter("username");
		String password = request.getParameter("password");
		
		if("tulsi".equalsIgnoreCase(username) && "kirola".equalsIgnoreCase(password)){
		
		Random random=new Random();
		random.nextInt();
		token.put("tokenVal",random.nextInt());
			
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession();
		session.setAttribute("user", username);
		session.setMaxInactiveInterval(1000000);
		
		//response.sendRedirect("loginSuccessful.jsp");
		
		RequestDispatcher rd =  request.getRequestDispatcher("loginSuccessful.jsp");
		writer.print("Login successful");
		rd.include(request, response);
		}
	}
	
}