package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(3.0);
        notas.add(9.0);
        notas.add(6.0);
        notas.add(5.0);
        notas.add(7.0);
        
        System.out.println(notas);
        
        System.out.println("Exxiba a posição da nota 5.0: " + notas.indexOf(5.0));
        
        System.out.println("Adicione na list a nota 8.0 na posição 4:");
        notas.add(4, 8.0);
        
        System.out.println(notas);
        
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        
        System.out.println("Confira se a nota 6.0 está na lista: " + notas.contains(5d));
        
       //System.out.println("Exiba todas as notas na ordem em que foram informados: ");
       // for (Double nota : notas) System.out.println(nota);
        
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        
        while (iterator.hasNext()) {
        	Double next = iterator.next();
        	soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        
        System.out.println("Remova a nota 3: ");
        notas.remove(3d);
        System.out.println(notas);
        
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
        	Double next = iterator1.next();
        	if (next < 7) iterator1.remove();
        }
        System.out.println(notas);
        
        System.out.println("Apague toda a lista");
        notas.clear();
        
        System.out.println(notas);
        
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }
}
	
