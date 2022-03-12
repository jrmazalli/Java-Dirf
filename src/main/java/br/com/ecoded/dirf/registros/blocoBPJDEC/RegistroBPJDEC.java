package br.com.ecoded.dirf.registros.blocoBPJDEC;

import java.time.LocalDate;

import br.com.ecoded.dirf.registros.blocoRTIRF.RegistroRTIRF;
import br.com.ecoded.dirf.registros.blocoRTRT.RegistroRTRT;

public class RegistroBPJDEC {

	private final String reg = "BPJDEC";
	private String cnpj;
	private String nome_empresarial;
	private Double valorImposto;
	private LocalDate dataEmissao;
	private String codRegra;

	private String janeiro;
	private String fevereiro;
	private String marco;
	private String abril;
	private String maio;
	private String junho;
	private String julho;
	private String agosto;
	private String setembro;
	private String outubro;
	private String novembro;
	private String dezembro;
	private String decimo_terceiro;

	private RegistroRTRT registroRTRT;
	private RegistroRTIRF registroRTIRF;

	public String getReg() {
		return reg;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome_empresarial() {
		return nome_empresarial;
	}

	public void setNome_empresarial(String nome_empresarial) {
		this.nome_empresarial = nome_empresarial;
	}

	public Double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(Double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getJaneiro() {
		return janeiro;
	}

	public void setJaneiro(String janeiro) {
		this.janeiro = janeiro;
	}

	public String getFevereiro() {
		return fevereiro;
	}

	public void setFevereiro(String fevereiro) {
		this.fevereiro = fevereiro;
	}

	public String getMarco() {
		return marco;
	}

	public void setMarco(String marco) {
		this.marco = marco;
	}

	public String getAbril() {
		return abril;
	}

	public void setAbril(String abril) {
		this.abril = abril;
	}

	public String getMaio() {
		return maio;
	}

	public void setMaio(String maio) {
		this.maio = maio;
	}

	public String getJunho() {
		return junho;
	}

	public void setJunho(String junho) {
		this.junho = junho;
	}

	public String getJulho() {
		return julho;
	}

	public void setJulho(String julho) {
		this.julho = julho;
	}

	public String getAgosto() {
		return agosto;
	}

	public void setAgosto(String agosto) {
		this.agosto = agosto;
	}

	public String getSetembro() {
		return setembro;
	}

	public void setSetembro(String setembro) {
		this.setembro = setembro;
	}

	public String getOutubro() {
		return outubro;
	}

	public void setOutubro(String outubro) {
		this.outubro = outubro;
	}

	public String getNovembro() {
		return novembro;
	}

	public void setNovembro(String novembro) {
		this.novembro = novembro;
	}

	public String getDezembro() {
		return dezembro;
	}

	public void setDezembro(String dezembro) {
		this.dezembro = dezembro;
	}

	public String getDecimo_terceiro() {
		return decimo_terceiro;
	}

	public void setDecimo_terceiro(String decimo_terceiro) {
		this.decimo_terceiro = decimo_terceiro;
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

	public String getCodRegra() {
		return codRegra;
	}

	public void setCodRegra(String codRegra) {
		this.codRegra = codRegra;
	}

}
