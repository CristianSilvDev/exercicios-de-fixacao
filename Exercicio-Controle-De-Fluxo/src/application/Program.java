package application;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Program {

	public static void main(String[] args) {
		imprimirSelecionado();
		System.out.println();
		System.out.println("========================");
		System.out.println(" RH ENTRANDO EM CONTATO ");
		System.out.println("========================");
		String [] candidatos= {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if (continuarTentando) {
				tentativasRealizadas++;
			} else {
				System.out.println("CONTATO COM REALIZADO COM SUCESSO");
			}
				
		} while (continuarTentando && tentativasRealizadas < 3);
		
		if (atendeu) {
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato+ " NA " + tentativasRealizadas + " TENTATIVAS");
		} else {
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionado() {
		String [] candidatos= {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println(" IMPRIMINDO A LISTA DE CANDIDATOS SELECIONADOS INFORMANDO O ÍNDICE DO ELEMENTO");
		for (int i = 0; i< candidatos.length; i++) {
			System.out.println("O CANDIDATO DE Nº " + (i+1) + " É " + candidatos[i]);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos= {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase=2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + String.format("%.2f", salarioPretendido));
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if ( salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CONDIDATO COM CONTRA PROPOSTA");
		} else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}