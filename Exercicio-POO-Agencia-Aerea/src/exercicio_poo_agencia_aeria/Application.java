package exercicio_poo_agencia_aeria;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model_entities.AgenciaAerea;
import model_entities.Cliente;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		AgenciaAerea agenciaAerea = new AgenciaAerea();

		System.out.println("------------------------------");
		System.out.println("      AGENCIA AÉREA - PL      ");
		System.out.println("------------------------------");

		System.out.println("SEJA BEM-VINDO(A) AO NOSSO APLICATIVO COMPRA-RÁPIDA DE PASSAGEM AÉREA.");
		System.out.print("VOCÊ DESEJA COMPRAR UMA PASSAGEM AÉREA? (S/N) ");
		char ch = sc.next().toUpperCase().charAt(0);
		if (ch == 'S') {
			System.out.print("DIGITE SEU NOME: ");
			sc.next();
			String nome = sc.nextLine();
			System.out.print("DIGITE SEU CPF (000-000-000-00): ");
			String cpf = sc.next();
			System.out.print("DATA DE IDA: ");
			Date dataIda = sdf.parse(sc.next());
			System.out.print("DATA DE VOLTA: ");
			Date dataVolta = sdf.parse(sc.next());
			System.out.print("CIDADE/PAÍS DE ORIGEM: ");
			String origem = sc.next();
			System.out.print("CIDADE/PAÍS DE DESTINO: ");
			sc.nextLine();
			String destino = sc.next();
			System.out.print("VALOR: ");
			sc.nextLine();
			double valor = sc.nextDouble();
			Cliente cliente = new Cliente(nome, cpf, dataIda, dataVolta, origem, destino, valor);

			
			System.out.print(cliente);

		} else {
			System.out.println("ENCERRANDO O PROGRAMA, ATÉ A PRÓXIMA!");
		}
		
		
	}

}
