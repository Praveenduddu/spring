package de.zeroco.dependencyinjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "de.zeroco.dependencyinjection")
public class TestConfig {

//	@Bean
//	public Car getObject() {
//		return new Car();
//	}
}
