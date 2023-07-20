package de.zeroco.annotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.zeroco.annotaion")
public class PaymentConfifaration {

//	@Bean(name = "payment")
//	public GooglePay getObject() {
//		GooglePay googlePay = new GooglePay();
//		googlePay.setPaymentId(123456789);
//		googlePay.setMobileRecharge(getMobileRecharge());
//		return googlePay;
//	}
//	
//	@Bean
//	public MobileRecharge getMobileRecharge() {
//		MobileRecharge mobileRecharge = new MobileRecharge();
//		mobileRecharge.setOperator("Airtel");
//		mobileRecharge.setPlanPrice(179);
//		return mobileRecharge;
//	}
}
