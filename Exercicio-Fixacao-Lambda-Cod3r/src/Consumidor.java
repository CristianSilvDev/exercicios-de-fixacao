import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!");
		
		Produto p1 = new Produto("Caneta", 12.0, 0.09);
		imprimir.accept(p1);
		Produto p2 = new Produto("Lapis", 14.0, 0.12);
		Produto p3 = new Produto("Caderno", 34.0, 0.03);
		Produto p4 = new Produto("Borracha", 3.0, 0.06);
		
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		produtos.forEach(imprimir);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
