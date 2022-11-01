package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {
	
	
    public static void main(String[] args) {
    	
    	List<Product> list = new ArrayList<>();
    	
    	list.add(new Product("TV", 900.00));
    	list.add(new Product("Notebook", 50.00));
    	list.add(new Product("Tablet", 350.50));
    	list.add(new Product("Mouse", 80.90));
    	
   
    	// Implementação da interface
    	/*list.forEach(new PriceUpdate());
    	list.forEach(System.out::println);*/
    	
    	/* Solução com o método estático
    	list.forEach(Product::staticPriceUpdate);
    	list.forEach(System.out::println);*/
    	
    	/*Solução com o método não estático
    	list.forEach(Product::nonStaticPriceUpdate);
    	list.forEach(System.out::println);*/
    	
    	/* Solução com expressão lambda declarada
    	Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
    	list.forEach(cons);
    	list.forEach(System.out::println);*/
    	
    	//Solução com expressão lambda inline
    	list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
    	list.forEach(System.out::println);
    }
}