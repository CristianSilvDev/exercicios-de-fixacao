import java.util.Arrays;

public class Foreach {
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.5};
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for (double nota: notas) {
			System.out.print(nota + " ");
		}
	}
}
