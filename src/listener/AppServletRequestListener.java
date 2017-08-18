package listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppServletRequestListener
 *
 */
@WebListener
public class AppServletRequestListener implements ServletRequestListener {

  
    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("Servlet request is destroyed");   
    	}

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
    	System.out.println("Servlet request is initialized"); 
    	System.out.println("Ip address of servlet" + sre.getServletRequest().getRemoteAddr());      

    	}
	
}
