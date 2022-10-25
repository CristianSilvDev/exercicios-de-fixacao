package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    
    	System.out.println("Ordem aleatória");
    	Set<Serie> minhasSeries = new HashSet<>() {{
    		add(new Serie("got", "fantasia", 60));
    		add(new Serie("dark", "drama", 60));
    		add(new Serie("that '70s show", "comedia", 60));
    		
    	}};
    	
    	for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    	System.out.println();
    	System.out.println("Ordem Inserção");
    	Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
    		add(new Serie("got", "fantasia", 60));
    		add(new Serie("dark", "drama", 60));
    		add(new Serie("that '70s show", "comedia", 50));
    		
    	}};
    	
    	for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    	
    	System.out.println();
    	System.out.println("Ordem natural (TempoEpisodio)");
    	Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    	for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}
	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	
	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0 ) return tempoEpisodio;
		
		return this.getGenero().compareTo(serie.getGenero());
	}
	
	
	
}