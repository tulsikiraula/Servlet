package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class AppSessionAttributeListener
 *
 */
@WebListener
public class AppSessionAttributeListener implements HttpSessionAttributeListener {

    public void attributeAdded(HttpSessionBindingEvent event)  { 
    	System.out.println("Session attribute added with name " + event.getName() + " and with value " + event.getValue());    
    	}

	
    public void attributeRemoved(HttpSessionBindingEvent event)  { 
    	System.out.println("Session attribute removed with name " + event.getName() + " and with value " + event.getValue());    
    }

    public void attributeReplaced(HttpSessionBindingEvent event)  { 
      System.out.println("Session attribute replaced with name " + event.getName() + " and with value " + event.getValue());    
    }
	
}
