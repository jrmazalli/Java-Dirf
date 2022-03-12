package br.com.ecoded.dirf.bo.blocoBPJDEC;

import br.com.ecoded.dirf.bo.blocoRTIRF.GerarRegistroRTIRF;
import br.com.ecoded.dirf.bo.blocoRTRT.GerarRegistroRTRT;
import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoBPJDEC.BlocoBPJDEC;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoBPJDEC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoBPJDEC blocoBPJDEC = dirf.getBlocoBPJDEC();
		sb = sbr;

		if (!Util.isEmpty(blocoBPJDEC.getRegistroBPJDEC())) {
			blocoBPJDEC.getRegistroBPJDEC().forEach(registroBPJDEC -> {
				GerarRegistroBPJDEC.gerar(registroBPJDEC, sb);
				GerarRegistroRTRT.gerar(registroBPJDEC.getRegistroRTRT(), sb);
				GerarRegistroRTIRF.gerar(registroBPJDEC.getRegistroRTIRF(), sb);
			});
		}
		return sb;
	}
}
