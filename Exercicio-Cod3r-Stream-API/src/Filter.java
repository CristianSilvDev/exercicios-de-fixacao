import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		
		//.stream() para transformar em Stream
		// .collect(Collectores.toList()) para transformar em List novamente
		numeros.stream().filter(s -> s % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
	}
}
