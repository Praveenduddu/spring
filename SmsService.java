package de.zeroco.setterinjection;

public class SmsService implements MessageService {

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String sendMessage() {
		return message;
	}

}
