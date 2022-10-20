package application;

import entities.Cars;

public class Program {
	public static void main(String[] args) {
		Cars carro1 = new Cars(null, null, 0);
		
		carro1.setCor("Azul");
		carro1.setModelo("Civic");
		carro1.setCapacidadeTanque(59);
		System.out.println("Carro 1:");
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6.39));
		
		System.out.println();
		Cars carro2 = new Cars("Cinza", "Mercedes-Benz", 66);
		System.out.println("Carro 2:");
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(6.29));
		
		
	}
}
