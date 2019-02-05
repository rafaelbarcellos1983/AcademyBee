package pt.bee.academy.firstproject.ioc;

public class TesteDAO {
	
	private String urlDataBase;
	private String password;
	private String user;
	
	public TesteDAO(String urlDataBase, String password, String user) {
		this.urlDataBase = urlDataBase;
		this.password = password;
		this.user = user;
	}
	
	public void save(TesteEntity teste) {
		System.out.println("Saving teste!");
		System.out.println("name: " + teste.getName());
	}
	
	public void findAll() {
		
	}
	
	public void findById(int id) {
		
	}
	
	public void delete(TesteEntity teste) {
		
	}

}
