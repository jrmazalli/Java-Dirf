package br.com.ecoded.dirf.bo.blocoFIMDIRF;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoFIMDIRF.BlocoFIMDIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoFIMDIRF {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoFIMDIRF blocoFIMDIRF = dirf.getBlocoFIMDIRF();
		sb = sbr;

		// REGISTRO_FIMDIRF
		if (!Util.isEmpty(blocoFIMDIRF.getRegistroFIMDIRF())) {
			GerarRegistroFIMDIRF.gerar(blocoFIMDIRF.getRegistroFIMDIRF(), sb);
		}

		return sb;
	}
}
