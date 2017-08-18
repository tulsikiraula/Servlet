package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppServletRequestAttributeListener
 *
 */
@WebListener
public class AppServletRequestAttributeListener implements ServletRequestAttributeListener {

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Servlet attribute removed with name "+ srae.getName()+" and value " + srae.getValue());   
    	}

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Servlet attribute added with name "+ srae.getName()+" and value " + srae.getValue());   
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println("Servlet attribute replaced with name "+ srae.getName()+" and value " + srae.getValue());   
    }
	
}
