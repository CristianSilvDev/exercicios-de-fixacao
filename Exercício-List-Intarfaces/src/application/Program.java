package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
    	List<Gato> meusGatos = new ArrayList<>() {{
    		add(new Gato("Jon", 18, "preto"));
    		add(new Gato("Simba", 6, "tigrado"));
    		add(new Gato("Jon", 18, "amarelo"));
    	}};
       
    	System.out.println("Ordem da Inserção");
    	System.out.println(meusGatos);
    	
    	System.out.println("Ordem aleatória");
    	Collections.shuffle(meusGatos);
    	System.out.println(meusGatos);
    	
    	System.out.println("Ordem Natural");
    	Collections.sort(meusGatos);
    	System.out.println(meusGatos);
    	
    	System.out.println("Ordem idade");
    }
}

class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade; 
	private String cor;
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "\n Gato [nome = " + nome + ", idade = " + idade + ", cor = " + cor + "]";
	}
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
	
}
	
