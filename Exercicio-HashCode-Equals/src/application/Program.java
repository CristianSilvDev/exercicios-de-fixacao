package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//CRIAÇAÕ DE NOVO OBJETO, SEM TRATAMENTO ESPECIAL POR ISSO O C1 == C2 DÁ FALSO
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		// TRATA A EXPRESSÃO DE UMA FORMA ESPECIAL PARA LITERAIS POR ISSO DÁ VERDADEIRO
		String s1 = "test";
		String s2 = "test";
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		System.out.println(s1 == s2);
	}
}
