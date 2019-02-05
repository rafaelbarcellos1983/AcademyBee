package pt.bee.academy.firstproject.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TesteController {

	
	TesteService service;
	
	@Autowired
	public TesteController(TesteService service) {
		this.service = service;
	}
	
	public void saveTeste(TesteEntity teste) {
		
		service.saveTeste(teste);
	}
}
