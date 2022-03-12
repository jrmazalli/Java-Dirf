package br.com.ecoded.dirf.bo.blocoBPJDEC;

import br.com.ecoded.dirf.registros.blocoBPJDEC.RegistroBPJDEC;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroBPJDEC {

	public static StringBuilder gerar(RegistroBPJDEC registroBPJDEC, StringBuilder sb) {

		sb.append("").append(Util.preencheRegistro(registroBPJDEC.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroBPJDEC.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroBPJDEC.getNome_empresarial()));
		sb.append("|").append('\n');

		return sb;
	}
}
