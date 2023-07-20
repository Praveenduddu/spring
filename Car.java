package de.zeroco.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	@Autowired
	private Tyre tyre;
	
	@Override
	public void drive() {
		System.out.println("driving car " + tyre);
	}

}
