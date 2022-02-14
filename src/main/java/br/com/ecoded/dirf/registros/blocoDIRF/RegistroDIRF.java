package br.com.ecoded.dirf.registros.blocoDIRF;

public class RegistroDIRF {

	private final String reg = "DIRF";
	private String ano_referencia;
	private String ano_calendario;
	private String ind_retificadora;
	private String num_recibo_anterior;
	private String ind_estrutura_leiaute;

	public String getAno_referencia() {
		return ano_referencia;
	}

	public void setAno_referencia(String ano_referencia) {
		this.ano_referencia = ano_referencia;
	}

	public String getAno_calendario() {
		return ano_calendario;
	}

	public void setAno_calendario(String ano_calendario) {
		this.ano_calendario = ano_calendario;
	}

	public String getInd_retificadora() {
		return ind_retificadora;
	}

	public void setInd_retificadora(String ind_retificadora) {
		this.ind_retificadora = ind_retificadora;
	}

	public String getNum_recibo_anterior() {
		return num_recibo_anterior;
	}

	public void setNum_recibo_anterior(String num_recibo_anterior) {
		this.num_recibo_anterior = num_recibo_anterior;
	}

	public String getInd_estrutura_leiaute() {
		return ind_estrutura_leiaute;
	}

	public void setInd_estrutura_leiaute(String ind_estrutura_leiaute) {
		this.ind_estrutura_leiaute = ind_estrutura_leiaute;
	}

	public String getReg() {
		return reg;
	}

}
