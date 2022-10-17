package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String [] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		int count = 0;
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if (!letra.equalsIgnoreCase("a") |
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u")) {
			consoantes[count] = letra;
			quantidadeConsoantes++;
			}
			count++;
			
		} while(count < consoantes.length);
		
		System.out.println("Consoantes");
		for (String consoante : consoantes) {
			System.out.println(consoante);
		} 
		
	}
}