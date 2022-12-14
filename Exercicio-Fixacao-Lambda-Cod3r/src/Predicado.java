import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicado {	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("TV", 3000.00, 0.15);
		Produto p2 = new Produto("Celular", 1000.00, 0.80);
		
		System.out.println(isCaro.test(produto));
		
		Predicate<Produto> isBarato = prod -> (prod.preco * (1 - prod.desconto)) <= 300;
		
		System.out.println(isBarato.test(p2));
		
		List<String> produtoz = Arrays.asList("Carlos", "Marcela", "Bia");
		
		produtoz.forEach(a -> System.out.println(a + "!!!"));
		
		produtoz.forEach(System.out::println);
		  
	}

}
 