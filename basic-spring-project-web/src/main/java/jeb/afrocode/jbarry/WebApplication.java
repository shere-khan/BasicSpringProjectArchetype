package jeb.afrocode.jbarry;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;


public class WebApplication implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext arg0) throws ServletException {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");

		HelloWorld helloWorldBean = (HelloWorld) context.getBean("helloWorldBean");
		helloWorldBean.printHelloWorld();
	}
}
