package listener;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AsyncServletContext
 *
 */
@WebListener
public class AsyncServletContext implements ServletContextListener {

    
    public void contextDestroyed(ServletContextEvent sce)  { 
    	ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 5, 10000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100));
    	sce.getServletContext().setAttribute("executor",
    			 poolExecutor);
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor)sce.getServletContext().getAttribute("executor");
    	poolExecutor.shutdown();
    }
	
}
