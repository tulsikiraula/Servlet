package listener;

import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppAsynchListener
 *
 */
@WebListener
public class AppAsynchListener implements AsyncListener {

   
    public void onComplete(AsyncEvent event) throws java.io.IOException { 
    	System.out.println("On complete");
    }

    public void onError(AsyncEvent event) throws java.io.IOException { 
    	System.out.println("On error");

    }
    public void onStartAsync(AsyncEvent event) throws java.io.IOException { 
    	System.out.println("On start");

    }
    public void onTimeout(AsyncEvent event) throws java.io.IOException { 
    	System.out.println("On timeOut");

    }
	
}
