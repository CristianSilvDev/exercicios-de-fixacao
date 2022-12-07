public class Program {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		
		System.out.println();
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
	}
}
