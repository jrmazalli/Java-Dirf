package br.com.ecoded.dirf.bo.blocoIDREC;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoIDREC.BlocoIDREC;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoIDREC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoIDREC blocoIDREC = dirf.getBlocoIDREC();

		sb = sbr;

		// REGISTRO_IDREC
		if (!Util.isEmpty(blocoIDREC.getRegistroIDREC())) {
			GerarRegistroIDREC.gerar(blocoIDREC.getRegistroIDREC(), sb);
		}

		return sb;
	}
}
