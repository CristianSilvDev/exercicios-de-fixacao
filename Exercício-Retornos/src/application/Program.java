package application;

import entities.Quadrilatero;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Exercício retornos: ");
	
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Area do Quadrado " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("Area do Quadrado " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Area do Quadrado " + areaTrapezio);
	}
	
}