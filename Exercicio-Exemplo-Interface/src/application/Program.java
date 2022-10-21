package application;

import entities.Calculadora;

public class Program  {
	public static void main(String[] args){
		
		Calculadora calc = new Calculadora();
		
		System.out.println("Resultado da soma: " + calc.soma(3, 4));
		System.out.println("Resultado da subtração: " + calc.subtracao(3, 4));
		System.out.println("Resultado da multiplicação: " + calc.multiplicacao(3, 4));
		System.out.println("Resultado da divisão: " + calc.divisao(3, 4));
		
		
	}
}
