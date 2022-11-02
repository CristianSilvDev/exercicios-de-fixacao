# Exercicio - Criando funções que recebem funções como parâmetro

Nesse exercício juntamente com o Professor Nélio Alves pude praticar os conceitos de criação de funções que recebem funções como parâmetro

-> Primeira Solução: 

	public double filteredSum(List<Product> list) {
		double sum = 0.0;
		for (Product p : list) {
			if (p.getName().charAt(0) == 'T') {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}

-> Segunda Solução: 

public class ProductSservice {
	
	public double filteredSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}

No programa principal: 

   	double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

    Instanciação direta com a expressão lambda. Assim, fechando a classe para alteração;