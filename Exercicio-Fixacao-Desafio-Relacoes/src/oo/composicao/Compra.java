package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}
	
	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(nome, qtd);
		this.itens.add(new Item(produto, qtd));
	}
	
	
	double oberValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
