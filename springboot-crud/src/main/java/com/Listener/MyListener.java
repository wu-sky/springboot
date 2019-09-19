
package com.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {
	//启动
	@Override
	public void contextInitialized(ServletContextEvent servletContextEvent) {
		System.out.println("监听器:web应用启动了...");
	}

	//销毁
	@Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		System.out.println("监听器:web应用销毁了...");
	}
}
