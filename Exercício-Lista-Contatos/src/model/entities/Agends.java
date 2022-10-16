package model.entities;

public class Agends {
	private String nome;
	private String numero;
	
	
	public Agends () {
		
	}


	public Agends(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String imprimir() {
		return "Nome: " + getNome() + "\nNúmero: " + getNumero();
	}
	
	

}
