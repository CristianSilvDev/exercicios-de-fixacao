package model.entities;

import java.util.ArrayList;

public class Estacionamento {
	private static ArrayList <RegrasEstacionamento> listaCarros = new ArrayList<>();
	
	
	//METODO GET
	public static ArrayList<RegrasEstacionamento> getEstacionamento(){
		return listaCarros;
	}
	
	// ADICIONAR UM OBJETO NA LISTA
	
	static public void adicionar(RegrasEstacionamento e) {
		listaCarros.add(e);
	}
	
	// LISTAR OS DADOS DE TODOS OS OBJETOS NA LISTA
	static public String listar() {
		String saida = "";
		int i = 1;
		for (RegrasEstacionamento e: listaCarros) {
			saida += "\n ====== CARRO Nº " + (i++) + " ======\n";
			saida += e.imprimir() + "\n";
		}
		return saida;
	}
	
	//PESQUISAR POR NOME
	static public int pesquisar (String nome) {
		int qtd = 0;
		for (RegrasEstacionamento e: listaCarros) {
			if (e.getNomeDoVeiculo().equalsIgnoreCase(nome)) {
				qtd++;
			}
		}
		return qtd;
	}
	
	// REMOVER OBJETO PELO NOME
	
	static public boolean remover(String nome) {
		for(RegrasEstacionamento e: listaCarros) {
			if(e.getNomeDoVeiculo().equalsIgnoreCase(nome)) {
				listaCarros.remove(e);
				return true;
			}
		}
		return false;
	}
	



}
