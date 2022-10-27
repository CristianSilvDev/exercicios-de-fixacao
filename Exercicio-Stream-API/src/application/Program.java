package application;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
    	
    	System.out.println("Ordem Aleatória");
    	Map<Integer, Contato> agenda = new HashMap<>() {{
    		put(1, new Contato("Simba", 5555));
    		put(2, new Contato("Cami", 1111));
    		put(3, new Contato("Jon", 2222));
    	}};
    	
    	System.out.println(agenda);
    	for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
		}
    	
    	System.out.println("Ordem número telefone");
    	//Praticando com classe anônima;
    	Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
    		@Override
    		public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
    			return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    		}
    	});
    	
    	set.addAll(agenda.entrySet());
    	for (Map.Entry<Integer, Contato> entry : set) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
		}
    }
}