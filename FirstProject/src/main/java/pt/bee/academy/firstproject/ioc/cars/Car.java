package pt.bee.academy.firstproject.ioc.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	
	private Engine engine;
	
	@Autowired
	public Car(@Qualifier("renault") Engine engine) {
		this.engine = engine;
	}
	
	public String drive() {
		return engine.run();
	}
}
