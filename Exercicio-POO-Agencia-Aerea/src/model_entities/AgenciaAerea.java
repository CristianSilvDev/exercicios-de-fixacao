package model_entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AgenciaAerea {
	private String nome;
	private String cpf;
	private Date dataIda;
	private Date dataVolta;
	private String origem;
	private String destino;
	private double valor;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public AgenciaAerea(String nome, String cpf, Date dataIda, Date dataVolta, String origem, String destino, double valor) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
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
	public Date getDataIda() {
		return dataIda;
	}
	public void setDataIda(Date dataIda) {
		this.dataIda = dataIda;
	}
	public Date getDataVolta() {
		return dataVolta;
	}
	public void setDataVolta(Date dataVolta) {
		this.dataVolta = dataVolta;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "OBRIGADO POR ESCOLHER A NOSSA AGENCIA AEREA\n" +
				"DADOS DA COMPRA\n" +
				"ORIGEM: " + getOrigem()+"\n" + "Destino: " + getDestino()+"\n" +
				"VALOR: R$ " + String.format("%.2f", getValor())+ "\n" +
				"NOME DO PASSAGEIRO: " + getNome()+"\n" +
				"CPF: " + getCpf()+ "\n" + 
				"DATA DE IDA: " + sdf.format(getDataIda()) + "\n" +
				"DATA DE VOLTA: " + sdf.format(getDataVolta()) + "\n" + 
				"TICKET: 4943240242\n" +
				"DESEJAMOS UM EXCELENTE VÔO \n" + 
				"EM CASO DE PROBLEMA ENTRE EM CONTATO CONOSCO 4393-9349\n";
				
	}
	
	
}
