package model.entities;

public class RegrasEstacionamento {
	private String nomeDoVeiculo;
	private String placaDoVeiculo;

	public RegrasEstacionamento(String nomeDoVeiculo, String placaDoVeiculo) {
		this.nomeDoVeiculo = nomeDoVeiculo;
		this.placaDoVeiculo = placaDoVeiculo;

	}

	public String getNomeDoVeiculo() {
		return nomeDoVeiculo;
	}

	public void setNomeDoVeiculo(String nomeDoVeiculo) {
		this.nomeDoVeiculo = nomeDoVeiculo;
	}

	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}

	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}
	
	public String imprimir() {
		return "Nome do veículo: " + getNomeDoVeiculo() + "\nPlaca Do Veículo: " + getPlacaDoVeiculo();
	}
}



