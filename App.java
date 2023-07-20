package de.zeroco.constructorinjection;

public class App implements Service {

	private String name;
	
	public App(String name) {
		this.name = name;
	}
	@Override
	public String execute() {
		return name + ",Your app is ready to use";
	}

}
