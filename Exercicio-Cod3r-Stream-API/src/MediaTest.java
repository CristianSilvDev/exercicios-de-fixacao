
public class MediaTest {
	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8.3).adicionar(6.7);
		Media m2 = new Media().adicionar(8.4).adicionar(6.9);
		
		System.out.println(m1.getValor());
		
	}
}
