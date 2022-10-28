package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
    	
    	List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
    	
    	/*System.out.println("Imprima todos os elementos dessa lista de String:" );
    	numerosAleatorios.forEach(System.out::println);*/
    	
    	System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
    	
    	numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
    	
    	System.out.println("Transforme esta lista de String em uma lista de números interios");
    	numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
    }
}