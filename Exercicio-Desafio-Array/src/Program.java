import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[3];
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		System.out.print("Quantas notas quer informar? ");
		int N = sc.nextInt();
		
		double[] notasAluno = new double [N];
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Digite a nota " + i + ": ");
			notasAluno[i] = sc.nextDouble();
		}
		double media = 0;
		for (double d: notasAluno) {
			System.out.print(d + " ");
			media += d;
		}
		System.out.println();
		System.out.println("A média do aluno foi: " + String.format("%.2f", media /  2));
	}
}
