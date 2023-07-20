package de.zeroco.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageSender {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
		MessageService messageService = (MessageService) applicationContext.getBean("email");
		System.out.println(messageService.sendMessage());
	}

}
