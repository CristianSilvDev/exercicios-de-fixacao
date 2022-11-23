# Exercicio - Spring Data JPA 

Nesse exercício juntamente com o Gleyson da Digital One Innovation, pudemos praticar sobre alguns conceitos do Spring Data JPA;

• Spring Data JPA adiciona seus prórpios recursos, como uma implementação sem código do padrão de repositório e a criaçaõ de consultas de banco de dados a partir de nomes de métodos;


• Interfaces

	• CrudRepository
	• JPARepository
	• Param 
	
•Anotações

	•@Query
	•@Param

• Para iniciar a aplicação utilizamos o CommandLineRunner:

@Component
public class StartApp implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setName("Cristian"); 
		user.setName("Cris");
		user.setPassword("123456");
		
		repository.save(user);
		
		for(User u : repository.findAll()) {
			System.out.println(u);
		}
	}
}