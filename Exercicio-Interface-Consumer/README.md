# Exercicio - Interface Consumer

Nesse exercício juntamente com o Professor Nélio Alves pude praticar os conceitos da Interface Consumer e apresentamos 5 maneiras diferentes para resolver o mesmo. Sendo elas:

• Implementação da interface -> 

        Criação da Classe PriceUpdate implementando Consumer e criando seu método:
        public class PriceUpdate implements Consumer<Product>{
	
	    @Override
	    public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	    }

        Instanciação:
    	list.forEach(new PriceUpdate());
        Imprimir na tela usando reference method;
    	list.forEach(System.out::println);

• Reference method com método estático

    Criação do método estático na classe Product
        public static void staticPriceUpdate(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

    Classe Main:
    list.forEach(Product::staticPriceUpdate);
    	list.forEach(System.out::println);


• Reference method com método não estático

    Criação do método não estático na Classe Product
    public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}

    list.forEach(Product::nonStaticPriceUpdate);
    list.forEach(System.out::println);

• Expressão lambda declarada

    Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
    	list.forEach(cons);
    	list.forEach(System.out::println);

• Expressão lambda inline

    list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
    list.forEach(System.out::println);