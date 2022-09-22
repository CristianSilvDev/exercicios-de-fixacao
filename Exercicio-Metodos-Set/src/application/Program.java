package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		
		//VERIFICANDO SE TEM A PALAVRA NA LISTA;
		System.out.println(set.contains("Notebook"));
		
		// COMO REMOVER DA LISTA COM MAIS DE 3 CARACTERES POR EXEMPLO;
		set.removeIf(x -> x.length() >= 3);
		// REMOVENDO DA LISTA TODA PALAVRA QUE COMEÇA COM T;
		set.removeIf(x -> x.charAt(0) == 'T');
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
