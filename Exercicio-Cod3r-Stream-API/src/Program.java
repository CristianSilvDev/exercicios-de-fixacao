import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Ana", "Carla");
		
		System.out.println("Usando o forEach");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nUsando Iterator...");
		
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		 
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno!!
		
	}
	
}
