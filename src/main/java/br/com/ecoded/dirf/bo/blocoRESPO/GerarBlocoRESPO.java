package br.com.ecoded.dirf.bo.blocoRESPO;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoRESPO.BlocoRESPO;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoRESPO {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoRESPO blocoRESPO = dirf.getBlocoRESPO();

		sb = sbr;

		// REGISTRO_RESPO
		if (!Util.isEmpty(blocoRESPO.getRegistroRESPO())) {
			GerarRegistroRESPO.gerar(blocoRESPO.getRegistroRESPO(), sb);
		}

		return sb;
	}
}
