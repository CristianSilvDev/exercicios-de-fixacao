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
		
		double media = 0;
		for (int i =0; i< notasAlunoA.length; i++) {
			media += notasAlunoA[i];
		}
		
		System.out.println(String.format("%.2f", media / notasAlunoA.length));
	}
}
