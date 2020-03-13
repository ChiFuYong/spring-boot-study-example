package com.chifuyong.lister;/*
package com.chifuyong.lister;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

*/

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * SpringBoot整合Listener
 */
public class SecondListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("SecondListener初始化成功");
	}

}
