package com.dbbyte.servletssb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		System.out.println("from ServletContextListener: " + " context initialized");

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("from ServletContextListener: " + " context destroyed");
	}
}