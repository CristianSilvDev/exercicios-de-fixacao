import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
	
		System.out.println("Forma tradicional");
		for (String a: aprovados) {
			System.out.println(a);
		}
		
		System.out.println("\nLambda #01");
		aprovados.forEach( a-> System.out.println(a  + "!!!!"));
		
		System.out.println("\nMethod Reference..");
		aprovados.forEach(System.out::println);
		
	}
}
