package br.com.ecoded.dirf.bo.blocoRTIRF;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoRTIRF.BlocoRTIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoRTIRF {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoRTIRF blocoRTIRF = dirf.getBlocoRTIRF();
		sb = sbr;

		if (!Util.isEmpty(blocoRTIRF.getRegistroRTIRF())) {
			GerarRegistroRTIRF.gerar(blocoRTIRF.getRegistroRTIRF(), sb);
		}
		return sb;
	}
}
