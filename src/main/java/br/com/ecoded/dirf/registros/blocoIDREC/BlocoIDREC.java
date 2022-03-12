package br.com.ecoded.dirf.registros.blocoIDREC;

import java.util.ArrayList;
import java.util.List;

public class BlocoIDREC {

	private List<RegistroIDREC> registroIDREC;

	public List<RegistroIDREC> getRegistroIDREC() {
		if (registroIDREC == null) {
			registroIDREC = new ArrayList<RegistroIDREC>();

		}
		return registroIDREC;
	}

	public void setRegistroIDREC(List<RegistroIDREC> registroIDREC) {
		this.registroIDREC = registroIDREC;
	}
}
