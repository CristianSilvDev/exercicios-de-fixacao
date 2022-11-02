package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductSservice;

public class Program {
	
	
    public static void main(String[] args) {
    	
    	List<Product> list = new ArrayList<>();
    	
    	list.add(new Product("TV", 900.00));
    	list.add(new Product("Notebook", 50.00));
    	list.add(new Product("Tablet", 350.50));
    	list.add(new Product("Mouse", 80.90));
    	
    	ProductSservice ps = new ProductSservice();
    	
    	double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
    	
    	System.out.println("Sum = " + String.format("%.2f", sum));
    }
}