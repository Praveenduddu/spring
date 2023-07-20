package de.zeroco.annotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionDetails {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PaymentConfifaration.class);
		PaymentGateWay paymentGateWay = (PaymentGateWay) applicationContext.getBean(GooglePay.class);
		System.out.println(paymentGateWay.paymentDetails());
		System.out.println(paymentGateWay.rechargePlan());
	}

}
