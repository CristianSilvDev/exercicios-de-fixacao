import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String palavra = sc.nextLine();
		String reversa = "";

		for (int i = (palavra.length() - 1); i >= 0; i--) {
			reversa += palavra.charAt(i);
		}

		if (reversa.toLowerCase().equals(palavra.toLowerCase())) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
