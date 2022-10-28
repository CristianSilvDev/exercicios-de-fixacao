package application;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.ToIntFunction;

public class Program {

    public static void main(String[] args) {
    	
    	List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
    	
    	/*System.out.println("Imprima todos os elementos dessa lista de String:" );
    	numerosAleatorios.forEach(System.out::println);*/
    	
    	/*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
    	
    	numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);*/
    	
    	/*System.out.println("Transforme esta lista de String em uma lista de números interios");
    	numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);*/
    	
    	//Exemplo completo / exemplo simplificado
    	System.out.println("Pegue os números pares e maiores que 2 e coloque em  uma lista");
    	/*List <Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
    		@Override
    		public boolean test(Integer i) {
    			if (i %2 == 0 && i>2) return true;
    			return false;
    		}
		}).collect(Collectors.toList());
    	System.out.println(listParesMaioresQue2);*/
    	
    	/*List <Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> (i % 2 == 0 && i>2))
    			.collect(Collectors.toList());
    	System.out.println(listParesMaioresQue2);*/
    	
    	System.out.println("Mostre a média dos números: ");
    	numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

    }
}