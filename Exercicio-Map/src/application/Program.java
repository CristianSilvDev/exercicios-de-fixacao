package application;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    
    	System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
    	Map<String, Double> carrosPopulares = new HashMap<>() {{
    		put("gol", 14.4);
    		put("uno", 15.6);
    		put("mobi", 16.1);
    		put("hb20", 14.5);
    		put("kwid", 15.6);
    	}};
    	
    	System.out.println(carrosPopulares);
    	
    	System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
    	carrosPopulares.put("gol", 16.1);
    	System.out.println(carrosPopulares);
    	
    	System.out.println("Confia se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
    	
    	System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
    	
    	/*System.out.println("Exiba o terceiro modelo adicionado: ");
    		não tem o método para mostrar */
    	
    	System.out.println("Exiba os modelos: ");
    	Set<String> modelos = carrosPopulares.keySet();
    	System.out.println(modelos);
    	
    	System.out.println("Exiba os consumos dos carros: ");
    	Collection<Double> consumos = carrosPopulares.values();
    	System.out.println(consumos);
    	
    	System.out.println("Exiba o modelo mais econômico e seu consumo: ");
    	Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
    	Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
    	String modeloMaisEficiente = "";
    	
    	for (Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMaisEficiente)) { 
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}
    	
    	
    }
}

