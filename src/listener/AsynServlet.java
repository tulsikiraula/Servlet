package listener;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadPoolExecutor;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsynServlet
 */
@WebServlet(urlPatterns="/AsynServlet" , asyncSupported=true)
public class AsynServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AsynServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter writer = response.getWriter();
		
		   long startTime = System.currentTimeMillis();
	        System.out.println("AsyncLongRunningServlet Start::Name="
	                + Thread.currentThread().getName() + "::ID="
	                + Thread.currentThread().getId());
	 
	        request.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
	 
	        String time = request.getParameter("time");
	        int secs = Integer.valueOf(time);
	        // max 10 seconds
	        if (secs > 10000)
	            secs = 10000;
		
		//AsynchSupport
		AsyncContext asynContext = request.startAsync();
		asynContext.addListener(new AppAsynchListener());
		 
		 ThreadPoolExecutor executor = (ThreadPoolExecutor) request
	                .getServletContext().getAttribute("executor");
	 
	        executor.execute(new AsynThreadPool(asynContext, secs));
	        long endTime = System.currentTimeMillis();
	        System.out.println("AsyncLongRunningServlet End::Name="
	                + Thread.currentThread().getName() + "::ID="
	                + Thread.currentThread().getId() + "::Time Taken="
	                + (endTime - startTime) + " ms.");
	    }	
	}
	
