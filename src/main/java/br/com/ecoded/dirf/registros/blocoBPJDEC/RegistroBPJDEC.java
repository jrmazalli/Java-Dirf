package br.com.ecoded.dirf.registros.blocoBPJDEC;

public class RegistroBPJDEC {

	private final String reg = "BPJDEC";
	private String cnpj;
	private String nome_empresarial;

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

	public String getReg() {
		return reg;
	}

}
