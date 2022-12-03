import java.util.Arrays;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		double [] notasAlunoA = new double[3];
		Locale.setDefault(Locale.US);
		
		notasAlunoA[0] = 4;
		notasAlunoA[1] = 5;
		notasAlunoA[2] = 7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for (int i =0; i< notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println(String.format("%.2f", totalA / notasAlunoA.length));
		
		double [] notasAlunosB = {6.9, 8.9, 5.5, 10};
		
		double totalB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalB += notasAlunosB[i];
		}
		System.out.println();
		System.out.println(String.format("%.2f",totalB / notasAlunosB.length));
	}
}
