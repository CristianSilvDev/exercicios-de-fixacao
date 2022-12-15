
public class Jogador {
	
	int x;
	int y;
	
	boolean andar(String direcao) {
		
		if ("norte".equalsIgnoreCase(direcao)) {
			
			y++;
		}
		
		return true;
	}
}
