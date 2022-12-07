import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		
		
		BinaryOperator<Double> soma = (x, y) -> { return x + y; };
		System.out.println(soma.apply(1.0, 3.0));
		
		soma = (x, y) -> x * y;
		System.out.println(soma.apply(3.0, 2.0)); 
	}
}
