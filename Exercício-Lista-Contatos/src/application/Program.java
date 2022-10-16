package application;

import java.util.Scanner;

import model.entities.Agends;
import model.entities.contacts;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner scEntrada = new Scanner(System.in);
		int menu;
		
		do {
			exibirMenu();
			menu = sc.nextInt();
			
			switch (menu) {
				case 1:
					System.out.println(" ===> CADASTRAR CONTATO");
					System.out.print("Digite o Nome: ");
					String nome = scEntrada.next();
					System.out.print("Digite o Número: ");
					String numero = scEntrada.next();
					
					// CRIAR OBJETO DA CLASSE
					Agends agenda = new Agends(nome, numero);
					
					// GUARDAR NO ARRAYLIST
					
					contacts.adicionar(agenda);
					break;
					
					
				case 2: 
					System.out.println("===> LISTAGEM DE CONTATOS: ");
					System.out.println(contacts.listar());
					if (contacts.listar() == null ) {
						System.out.println("A LISTA ESTÁ VAZIA");
					}
					break;
					
				case 3:
					System.out.println("====> EXCLUSÃO DO CONTATO");
					System.out.print("DIGITE O NOME DO CONTATO ");
					nome = scEntrada.next();
					if (! (contacts.getList().isEmpty())) { // agenda vazia
						if (contacts.remover(nome)) {
							System.out.println("CONTATO REMOVIDO COM SUCESSO");
						} else {
							System.out.println("CONTATO NÃO ENCONTRADO");
						}
					} else {
						System.out.println("NÃO EXISTEM CONTATOS NA AGENDA");
					}
					break;
				
					default:
						System.out.println("Opção de menu inválida!!");
			}
			
		} while (menu != 4);
	}
	
	static void exibirMenu() {
		System.out.println("-------------------------------");
		System.out.println("       AGENDA CONTATOS         ");
		System.out.println("-------------------------------");
		System.out.println("1 - CADASTRAR ");
		System.out.println("2 - LISTAR ");
		System.out.println("3 - EXCLUIR CONTATO");
		System.out.println("4 - SAIR" );
		
	}

}
