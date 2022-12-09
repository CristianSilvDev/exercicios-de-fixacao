import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Ana", "Carka");
		
		System.out.println("Usando o forEach");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nUsando Iterator...");
		
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
