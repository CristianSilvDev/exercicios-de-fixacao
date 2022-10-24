package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	List<Double> temperaturas = new ArrayList<>();
    	
    	for (int i = 1; i<=6; i++) {
    		System.out.print("Digite a " + i+ "ª temperatura ");
    		temperaturas.add(sc.nextDouble());
    	}
    	
        Iterator<Double> iterator = temperaturas.iterator();
        
    	Double soma = 0d;
    	while (iterator.hasNext()) {
        	Double next = iterator.next();
        	soma += next;
        }
    	Double media = soma/temperaturas.size();
    	System.out.println("A média das temperaturas é de " + String.format("%.2f", media));
    	
    	 Iterator<Double> iterator1 = temperaturas.iterator();
         while(iterator1.hasNext()) {
         	Double next = iterator1.next();
         	if (next < media) {
         		temperaturas.indexOf(iterator1);
         	}
         }
         System.out.println(temperaturas.indexOf(iterator1));
    	
    }

	
}
