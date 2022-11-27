package model_entities;

import java.util.Date;

public class Cliente extends AgenciaAerea {

	protected String nome;
	protected String cpf;

	public Cliente(String nome, String cpf, Date dataIda, Date dataVolta, String origem, String destino, double valor) {
		super(dataIda, dataVolta, origem, destino, valor);
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {

		return "------------------------------\n" + "      AGENCIA AÉREA - PL      \n" + "------------------------------\n"
				+ "OBRIGADO POR ESCOLHER A NOSSA AGENCIA AEREA\n" + "DADOS DA COMPRA: \n" + "ORIGEM: " + getOrigem()
				+ "\n" + "Destino: " + getDestino() + "\n" + "VALOR: R$ " + String.format("%.2f", getValor()) + "\n"
				+ "NOME DO PASSAGEIRO: " + getNome() + "\n" + "CPF: " + getCpf() + "\n" + "DATA DE IDA: "
				+ sdf.format(getDataIda()) + "\n" + "DATA DE VOLTA: " + sdf.format(getDataVolta()) + "\n"
				+ "TICKET: 4943240242\n" + "DESEJAMOS UM EXCELENTE VÔO \n"
				+ "EM CASO DE PROBLEMA ENTRE EM CONTATO CONOSCO 4393-9349.\n";

	}

}
