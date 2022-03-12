package br.com.ecoded.dirf.bo.blocoRTRT;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoRTRT.BlocoRTRT;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoRTRT {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoRTRT blocoRTRT = dirf.getBlocoRTRT();
		sb = sbr;

		if (!Util.isEmpty(blocoRTRT.getRegistroRTRT())) {
			GerarRegistroRTRT.gerar(blocoRTRT.getRegistroRTRT(), sb);
		}

		return sb;

	}
}
