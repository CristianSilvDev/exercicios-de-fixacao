// Classe Principal - Exercício de Fixação
package Application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramFicacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company? (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                Double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int funcionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        double soma = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");

        for (Pessoa pessoa : list) {
            double juros = pessoa.desconto();
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", juros));
            soma += juros;
        }
        System.out.println("");
        System.out.println("TOTAL TAXAS: $ " + String.format("%.2f", soma));
    }
}
