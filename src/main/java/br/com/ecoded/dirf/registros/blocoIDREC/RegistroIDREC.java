package br.com.ecoded.dirf.registros.blocoIDREC;

import br.com.ecoded.dirf.registros.blocoBPJDEC.RegistroBPJDEC;
import br.com.ecoded.dirf.registros.blocoRTIRF.RegistroRTIRF;
import br.com.ecoded.dirf.registros.blocoRTRT.RegistroRTRT;

public class RegistroIDREC {

	private final String reg = "IDREC";
	private String cod_receita;

	private RegistroBPJDEC registroBPJDEC;
	private RegistroRTRT registroRTRT;
	private RegistroRTIRF registroRTIRF;

	public String getReg() {
		return reg;
	}

	public String getCod_receita() {
		return cod_receita;
	}

	public void setCod_receita(String cod_receita) {
		this.cod_receita = cod_receita;
	}

	public RegistroBPJDEC getRegistroBPJDEC() {
		return registroBPJDEC;
	}

	public void setRegistroBPJDEC(RegistroBPJDEC registroBPJDEC) {
		this.registroBPJDEC = registroBPJDEC;
	}

	public RegistroRTRT getRegistroRTRT() {
		return registroRTRT;
	}

	public void setRegistroRTRT(RegistroRTRT registroRTRT) {
		this.registroRTRT = registroRTRT;
	}

	public RegistroRTIRF getRegistroRTIRF() {
		return registroRTIRF;
	}

	public void setRegistroRTIRF(RegistroRTIRF registroRTIRF) {
		this.registroRTIRF = registroRTIRF;
	}

}
