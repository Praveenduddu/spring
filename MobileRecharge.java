package de.zeroco.annotaion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MobileRecharge {

	String operator;
	int planPrice;

	@Override
	public String toString() {
		return "MobileRecharge [operator=" + operator + ", planPrice=" + planPrice + "]";
	}

	public String getOperator() {
		return operator;
	}

	@Value("Airtel")
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public int getPlanPrice() {
		return planPrice;
	}

	@Value("179")
	public void setPlanPrice(int planPrice) {
		this.planPrice = planPrice;
	}
}
