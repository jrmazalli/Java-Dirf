package br.com.ecoded.dirf.bo.blocoDECPJ;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoDECPJ.BlocoDECPJ;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoDECPJ {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoDECPJ blocoDECPJ = dirf.getBlocoDECPJ();
		sb = sbr;

		if (!Util.isEmpty(blocoDECPJ.getRegistroDECPJ())) {
			GerarRegistroDECPJ.gerar(blocoDECPJ.getRegistroDECPJ(), sb);
		}
		return sb;
	}
}
