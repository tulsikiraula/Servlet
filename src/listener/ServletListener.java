package listener;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletListener")
public class ServletListener extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		
		ServletContext context = request.getServletContext();
		
		//set and get attribute in application scope
		context.setAttribute("User", "tulsi");
		String name = (String)context.getAttribute("User");
		context.removeAttribute("User");
		
		
		//set and get attribute in request scope
		request.setAttribute("Id", 12345);
		System.out.println(request.getAttribute("Id"));
	
		//set attribute in session scope
		HttpSession session = request.getSession();
		session.setAttribute("userN", "kiraula");
		
		//set sessionBinding attribute
		session.setAttribute("BindingName", new AppSessionbindingListener());
		
		session.invalidate();
		
		writer.print("Hi " + name);
		
	}

	

}
