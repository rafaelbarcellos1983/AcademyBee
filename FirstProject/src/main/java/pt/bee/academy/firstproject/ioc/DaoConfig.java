package pt.bee.academy.firstproject.ioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import pt.bee.academy.firstproject.ioc.cars.Engine;
import pt.bee.academy.firstproject.ioc.cars.FerrariEngine;
import pt.bee.academy.firstproject.ioc.cars.RenaultEngine;

@Configuration
public class DaoConfig {

	@Bean
	public TesteDAO testeDAO() {
		return new TesteDAO("http://dabatase", "12345678", "root");
	}
	
	@Primary
	@Bean
	public Engine ferrariEngine() {
		return new FerrariEngine();
	}
	
	@Bean
	@Qualifier("renault")
	public Engine renaultEngine() {
		return new RenaultEngine();
	}
}
