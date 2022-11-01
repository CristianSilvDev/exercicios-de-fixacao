package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	
	
    public static void main(String[] args) {
    	
    	List<Product> list = new ArrayList<>();
    	
    	list.add(new Product("TV", 900.00));
    	list.add(new Product("Notebook", 50.00));
    	list.add(new Product("Tablet", 350.50));
    	list.add(new Product("Mouse", 80.90));
    	
    	/* Implementação pela Interface
    	List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
    	names.forEach(System.out::println);*/
    	
    	/* Implementação com o método estático
    	List <String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
    	names.forEach(System.out::println);*/
    	
    	/* Implementação sem o método estático
    	List <String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
    	names.forEach(System.out::println);*/
    	
    	Function<Product, String> func = p -> p.getName().toUpperCase();
    	
    	List <String> names = list.stream().map(func).collect(Collectors.toList());
    	names.forEach(System.out::println);
    }
}