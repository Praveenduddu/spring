package de.zeroco.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DBOperations {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("beans.xml");
		Dao dao = (Dao) applicationContext.getBean("dao");
//		System.out.println(dao.insert(new Customer("praveen@gmail.com", "praveen", 123456789, "2000-02-26", 23)));
//		System.out.println(dao.update(new Customer(21, "praveen@gmail.com", "praveen", 987654321, "2000-02-26", 23)));
//		System.out.println(dao.delete(21));
//		System.out.println(dao.get(120));
//		System.out.println(dao.List());
//		System.out.println(dao.getGeneratedKey(new Customer("praveen@gmail.com", "praveen", 123456789, "2000-02-26", 23)));
	}

}
