package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.PriceUpdate;

public class Program {
	
	
    public static void main(String[] args) {
    	
    	List<Product> list = new ArrayList<>();
    	
    	list.add(new Product("TV", 900.00));
    	list.add(new Product("Notebook", 50.00));
    	list.add(new Product("Tablet", 350.50));
    	list.add(new Product("Mouse", 80.90));
    	
   
    	list.forEach(new PriceUpdate());
    	
    	list.forEach(System.out::println);
    	
    }
}