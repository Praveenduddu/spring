package de.zeroco.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestDrive {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Vehicle vehicle = (Vehicle) context.getBean("car");
		vehicle.drive();
//		Tyre tyre = (Tyre) context.getBean("tyre");
//		System.out.println(tyre.toString());
	}

}
