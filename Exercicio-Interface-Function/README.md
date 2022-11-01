# Exercicio - Interface Function -> Recebe um argumento de Entrada e uma resposta Saída, caso queira transformar uma lista de Product em String deve fazer o implements dessa maneira: public class UpperCaseName implements Function<Product, String> {

Nesse exercício juntamente com o Professor Nélio Alves pude praticar os conceitos da Interface Predicate e apresentamos 5 maneiras diferentes para resolver o mesmo. Sendo elas -

• Implementação da interface - Criando uma Classe e implementando;
public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}

O .stream() transforma a Lista em Stream, e o Collect retorna para List. Ou seja, converte para Stream para fazer as operações e depois chama o Collect para retornar esse valor em List. O Map faz percorrer toda a List.

List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
    	names.forEach(System.out::println);


• Reference method com método estático - Criando um método sendo ele estático passando o parâmetro como argumento;

	Na classe Product:

		public static String staticUpperCaseName(Product p) {
		return p.getName().toUpperCase();
	}
	No Program:
	List <String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
    	names.forEach(System.out::println);

• Reference method com método não estático - Criando um método não estático;

	public String nonStaticUpperCaseName() {
		return name = name.toUpperCase();
	}
	No Program:
	List <String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
    	names.forEach(System.out::println);

• Expressão lambda declarada - declarar uma expressão lambda;

	Function<Product, String> func = p -> p.getName().toUpperCase();
    	List <String> names = list.stream().map(func).collect(Collectors.toList());
    	names.forEach(System.out::println);

• Expressão lambda inline - não declarar a expressão lambda, passar ela diretamente como argumento;
	
	List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
    	names.forEach(System.out::println);