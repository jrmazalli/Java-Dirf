package br.com.ecoded.dirf.bo.blocoIDREC;

import br.com.ecoded.dirf.registros.blocoIDREC.RegistroIDREC;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroIDREC {

	public static StringBuilder gerar(RegistroIDREC registroIDREC, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroIDREC.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroIDREC.getCod_receita()));
		sb.append("|").append('\n');

		return sb;
	}
}