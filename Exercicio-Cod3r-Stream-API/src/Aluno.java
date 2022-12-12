
public class Aluno {
	final String nome;
	final double nota;
	final boolean comportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	
	public Aluno(String nome, double nota, boolean comportamento) {
		this.nome = nome;
		this.nota = nota;
		this.comportamento = comportamento;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota=" + nota;
	}
	
	
}
