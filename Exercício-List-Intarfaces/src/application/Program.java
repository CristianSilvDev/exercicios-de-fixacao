package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
    	//Collections.sort(meusGatos, new ComparatorIdade());
    	meusGatos.sort(new ComparatorIdade());
    	System.out.println(meusGatos);
    	
    	System.out.println("Ordem Cor");
    	meusGatos.sort(new ComparatorCor());
    	System.out.println(meusGatos);
    	
    	System.out.println("Ordem Nome/Cor/Idade");
    	Collections.sort(meusGatos, new ComparatorNomeCorIdade());
    	
    	System.out.println(meusGatos);
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

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
	
class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareTo(g2.getNome());
		if (nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}
