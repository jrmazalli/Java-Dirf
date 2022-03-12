package br.com.ecoded.dirf.bo.blocoDIRF;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoDIRF.BlocoDIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoDIRF {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {

		BlocoDIRF blocoDIRF = dirf.getBlocoDIRF();

		sb = sbr;

		if (!Util.isEmpty(blocoDIRF.getRegistroDIRF())) {
			GerarRegistroDIRF.gerar(dirf, blocoDIRF.getRegistroDIRF(), sb);
		}

		return sb;
	}
}
