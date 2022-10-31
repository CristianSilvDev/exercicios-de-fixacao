# Exercicio - Interface Predicate

Nesse exercício juntamente com o Professor Nélio Alves pude praticar os conceitos da Interface Predicate e apresentamos 5 maneiras diferentes para resolver o mesmo. Sendo elas -

• Implementação da interface - Criando uma Classe e implementando;
public class ProductPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100.0;
	}

• Reference method com método estático - Criando um método sendo ele estático passando o parâmetro como argumento;
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}

• Reference method com método não estático - Criando um método não estático;
	
public boolean nonStaticProductPredicate() {
		return price >= 100.00;
	}

• Expressão lambda declarada - declarar uma expressão lambda;
	
Predicate<Product> pred = p -> p.getPrice() >= 100.0;*/
list.removeIf(pred);

• Expressão lambda inline - não declarar a expressão lambda, passar ela diretamente como argumento;
	
Exemplo: list.removeIf(p -> p.getPrice() >= 100.0);
