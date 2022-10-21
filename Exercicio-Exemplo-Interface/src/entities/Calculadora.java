package entities;

public class Calculadora implements OperacaoMatematica {

	@Override
	public double soma(double operando1, double operando2) {
		return operando1 + operando2;
		
	}

	@Override
	public double subtracao(double operando1, double operando2) {
		return operando1 - operando2;
		
	}

	@Override
	public double multiplicacao(double operando1, double operando2) {
		return operando1 * operando2;
		
	}

	@Override
	public double divisao(double operando1, double operando2) {
		return operando1/operando2;
		
	}

}
