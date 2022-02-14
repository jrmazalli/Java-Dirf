package br.com.ecoded.dirf.registros.blocoRESPO;

public class RegistroRESPO {

	private final String reg = "RESPO";
	private String cpf;
	private String nome;
	private String ddd; // Primeiro algarismo deve ser diferente de zero
	private String telefone; // deve ser preenchido com oito ou nome algarismos.
	private String ramal; 
	private String fax; // deve ser preenchido com oito ou nome algarismos.
	private String email;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReg() {
		return reg;
	}

}
