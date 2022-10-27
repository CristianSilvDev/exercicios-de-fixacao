package application;

import java.util.Objects;

public class Contato {
	private String nome;
	private Integer numero;
	public Contato(String nome, Integer numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
	public String getNome() {return nome;}
	
	public Integer getNumero() {return numero;}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero);
	}
	
	
}
