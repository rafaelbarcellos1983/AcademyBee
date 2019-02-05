package pt.bee.academy.firstproject.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TesteService {
	
	private TesteDAO testeDAO;
	
	@Autowired
	public TesteService(TesteDAO testeDAO) {
		this.testeDAO = testeDAO;
	}
	
	public void saveTeste(TesteEntity teste) {
		//VALIDATIONS
		
		//testeDAO = new TesteDAO("http://dabatase", "12345678", "root");
		testeDAO.save(teste);
	}

}
