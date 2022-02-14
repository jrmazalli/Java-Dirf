package br.com.ecoded.dirf.bo.blocoBPJDEC;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoBPJDEC.BlocoBPJDEC;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoBPJDEC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoBPJDEC blocoBPJDEC = dirf.getBlocoBPJDEC();
		sb = sbr;

		// REGISTRO_BPJDEC
		if (!Util.isEmpty(blocoBPJDEC.getRegistroBPJDEC())) {
			GerarRegistroBPJDEC.gerar(blocoBPJDEC.getRegistroBPJDEC(), sb);
		}

		return sb;

	}
}
