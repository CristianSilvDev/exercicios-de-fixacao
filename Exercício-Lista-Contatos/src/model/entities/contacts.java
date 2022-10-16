package model.entities;

import java.util.ArrayList;
import java.util.List;

public class contacts {
	
	private static ArrayList<Agends> Contatos = new ArrayList<>();

	public static ArrayList<Agends> getList(){
		return Contatos;
		
	}
	
	// ADICIONAR UM OBJETO NA LISTA
	
	static public void adicionar(Agends c) {
		Contatos.add(c);
	}
	
	// LISTAR OS DADOS DE TODOS OS OBJETOS NA LISTA

	static public String listar() {
		String saida = "";
		int i= 1;
		for (Agends l : Contatos) {
			saida += "\n ===== CONTATO Nº " + (i++) + " ===== \n";
			saida += l.imprimir() + "\n";
			
		}
		
		return saida;
	}
	
	//REMOVER OBJETO PELO NOME
	
	static public boolean remover(String nome) {
		for (Agends l: Contatos) {
			if (l.getNome().equalsIgnoreCase(nome)) {
				Contatos.remove(l);
				return true;
			}
		}
		return false;
	}
	
}
