package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AppServletContextListener
 *
 */
@WebListener
public class AppServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();
		String name = context.getInitParameter("UserName");
		String age = context.getInitParameter("UserAge");

		UserDetail detail = new UserDetail();
		detail.setName(name);
		detail.setAge(age);

		context.setAttribute("UserDetail", detail);

		System.out.println("Context initialized successfully");
		System.exit(1);

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();
		UserDetail detail = new UserDetail();
		detail.display();

		detail = (UserDetail) context.getAttribute("UserDetail");
		System.out.println("Context destroyed successfully");

	}

}
