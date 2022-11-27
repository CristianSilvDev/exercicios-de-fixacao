package model_entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AgenciaAerea {
	
	private Date dataIda;
	private Date dataVolta;
	private String origem;
	private String destino;
	private double valor;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public AgenciaAerea() {
		
	}
	
	public AgenciaAerea( Date dataIda, Date dataVolta, String origem, String destino, double valor) {
		this.dataIda = dataIda;
		this.dataVolta = dataVolta;
		this.origem = origem;
		this.destino = destino;
		this.valor = valor;
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

	
	
}
