package oo.composicao;

public class CompraTeste {
	
	/**
	 * Relacionamento de um para muitos
	 * @param args
	 */

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Cristian";
		c1.itens.add(new Item("TV", 3, 2000.00));
		c1.itens.add(new Item("Borracha", 12, 3.89));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
	}
}
