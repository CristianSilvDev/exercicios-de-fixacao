package application;

import java.util.Scanner;

import model.entities.Estacionamento;
import model.entities.RegrasEstacionamento;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		Scanner entradaString = new Scanner(System.in);
		
		int menu;
		double valorInicial, valorPorHora;
		String nome, nomeDoVeiculo, placaDoVeiculo;
		
		do {
			exibirMenu();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
					System.out.println("===> CADASTRAR CARRO");
					System.out.print("Digite o nome do veiculo: ");
					nomeDoVeiculo = entradaString.next();
					System.out.print("Digite a placa do veículo: ");
					placaDoVeiculo = entradaString.next();
					
					RegrasEstacionamento estacionamento = new RegrasEstacionamento(nomeDoVeiculo, placaDoVeiculo);
					
					//ADICIONAR NO ARRAYLIST
					
					Estacionamento.adicionar(estacionamento);
					break;
			case 2:
				System.out.println("====> LISTAGEM DE CARROS");
				System.out.println(Estacionamento.listar());
				if (Estacionamento.listar() == null ) {
					System.out.println("A LISTA ESTÁ VAZIA");
				}
				break;
				
			case 3:
				System.out.println("====> REMOÇÃO DE CARRO");
				System.out.print("Digite o nome do Veículo: ");
				nomeDoVeiculo = entradaString.next();
				
				if(! (Estacionamento.getEstacionamento().isEmpty())) { //ESTACIONAMENTO VAZIO
					if (Estacionamento.remover(nomeDoVeiculo)) {
						System.out.println("Carro removido com sucesso");
						
					} else {
						System.out.println("Carro não encontrado");
					}
				} else {
					System.out.println("O estacionamento está vazio");
				}
				
				
				break;
				
			case 4:
				System.out.println("Saindo");
				break;
				default:
					System.out.println("Opção de menu inválida");
			}
			
		} while (menu != 4);
	
	}
		static void exibirMenu() {
			System.out.println("-------------------------------");
			System.out.println("        ESTACIONAMENTO         ");
			System.out.println("-------------------------------");
			System.out.println("1 - CADASTRAR CARRO ");
			System.out.println("2 - LISTAR ");
			System.out.println("3 - REMOVER CARRO");
			System.out.println("4 - SAIR" );
			
	}

}
