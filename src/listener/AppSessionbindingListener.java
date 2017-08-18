package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class AppSessionbindingListener
 *
 */
@WebListener
public class AppSessionbindingListener implements HttpSessionBindingListener {

   
    public void valueBound(HttpSessionBindingEvent event)  { 
    	System.out.println("Session attribute bound with " + event.getName() + " and with value" + event.getValue());    
    	}

	
    public void valueUnbound(HttpSessionBindingEvent event)  { 
    	System.out.println("Session attribute unbound with " + event.getName() + " and with value" + event.getValue());    
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AppSessionbindingListener [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
