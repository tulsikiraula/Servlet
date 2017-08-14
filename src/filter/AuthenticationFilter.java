package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/LogoutServlet")
public class AuthenticationFilter implements Filter {
	ServletContext context;

	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String uri = req.getRequestURL().toString();
		this.context.log("Requested Resource::" + uri);

		this.context.log("Remote Address " + req.getRemoteAddr());
		this.context.log("Remote Host " + req.getRemoteHost());

		HttpSession session = req.getSession();

		if (session == null || !uri.endsWith("LoginServlet") || !uri.endsWith("jsp") || !uri.endsWith("html")
				|| !uri.endsWith("LogoutServlet")) {
			context.log("unauthorized access");
			res.sendRedirect("Login.html");
		}
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		context=fConfig.getServletContext();
		context.log("Authentication filter initialized");
	}

}
