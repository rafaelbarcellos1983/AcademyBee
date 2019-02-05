package pt.bee.academy.firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pt.bee.academy.firstproject.ioc.TesteController;
import pt.bee.academy.firstproject.ioc.cars.Car;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

	@Autowired
	TesteController controller;
	
	
	@Autowired
	Car car;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		TesteEntity testeEntity = new TesteEntity();
//		testeEntity.setName("Rafael");
//		controller.saveTeste(testeEntity);	
		
		System.out.println(car.drive());
	}

}

