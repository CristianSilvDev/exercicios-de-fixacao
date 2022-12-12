import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		//List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);
		
		//.stream() para transformar em Stream
		// .collect(Collectores.toList()) para transformar em List novamente
		//numeros.stream().filter(s -> s % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);
		 
		
		Aluno a1 = new Aluno("Ana", 7.8, false);
		Aluno a2 = new Aluno("Bia", 5.8, true);
		Aluno a3 = new Aluno("Daniel", 9.8, true);
		Aluno a4 = new Aluno("Gui", 6.8, false);
		Aluno a5 = new Aluno("Rebeca", 7.1, true);
		Aluno a6 = new Aluno("Pedro", 8.8, true);

		// Primeira Maneira
		/*List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabéns " + a.nome + " você foi aprovado")
		.forEach(System.out::println);*/
		
		//Segunda Forma
		
		/*Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		alunos.stream()
		.filter(aprovado)
		.map(a -> "Parabéns " + a.nome + " você foi aprovado")
		.forEach(System.out::println);*/
		
		
		// Terceira maneira
		Predicate<Aluno> aprovado = a -> a.nota >= 7 && a.comportamento == true;
		
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + " você foi aprovado";
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		alunos.stream()
		.filter(aprovado)
		.map(saudacaoAprovado)
		.forEach(System.out::println); 
	}
}
