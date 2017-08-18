package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class AppSessionListener
 *
 */
@WebListener
public class AppSessionListener implements HttpSessionListener {

 
    public void sessionCreated(HttpSessionEvent se)  { 
    	System.out.println("Session created with id : " + se.getSession().getId());
    }


    public void sessionDestroyed(HttpSessionEvent se)  { 
    	System.out.println("Session destroyed with id : " + se.getSession().getId());
    }
	
}
