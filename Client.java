package de.zeroco.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
		Service service = (Service) applicationContext.getBean("app");
		System.out.println(service.execute());
	}

}
