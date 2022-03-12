package br.com.ecoded.dirf.registros.blocoBPJDEC;

import java.util.ArrayList;
import java.util.List;

public class BlocoBPJDEC {

	private List<RegistroBPJDEC> registroBPJDEC;

	public List<RegistroBPJDEC> getRegistroBPJDEC() {
		if (registroBPJDEC == null) {
			registroBPJDEC = new ArrayList<RegistroBPJDEC>();

		}
		return registroBPJDEC;
	}

	public void setRegistroBPJDEC(List<RegistroBPJDEC> registroBPJDEC) {
		this.registroBPJDEC = registroBPJDEC;
	}

}
