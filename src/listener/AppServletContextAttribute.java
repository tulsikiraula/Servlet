package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppServletContextAttribute
 *
 */
@WebListener
public class AppServletContextAttribute implements ServletContextAttributeListener {

	
    public void attributeAdded(ServletContextAttributeEvent event)  { 
    	System.out.println("Context attribute added with name "+ event.getName() + " and value "+event.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent event)  { 
    	System.out.println("Context attribute removed with name "+ event.getName() + " and value "+event.getValue());

    }


    public void attributeReplaced(ServletContextAttributeEvent event)  { 
    	System.out.println("Context attribute replaced with name "+ event.getName() + " and value "+event.getValue());

    }
	
}
