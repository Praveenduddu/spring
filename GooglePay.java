package de.zeroco.annotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePay implements PaymentGateWay {

	private int paymentId;
	@Autowired
	private MobileRecharge mobileRecharge;

	public MobileRecharge getMobileRecharge() {
		return mobileRecharge;
	}

	public void setMobileRecharge(MobileRecharge mobileRecharge) {
		this.mobileRecharge = mobileRecharge;
	}

	public String rechargePlan() {
		return mobileRecharge.toString();
	}

	@Override
	public String paymentDetails() {
		return "Payment ID : " + paymentId;
	}

	public int getPaymentId() {
		return paymentId;
	}

	@Value("1234567")
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

}
