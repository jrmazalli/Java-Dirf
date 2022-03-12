package br.com.ecoded.dirf.bo;

import br.com.ecoded.dirf.bo.blocoDECPJ.GerarBlocoDECPJ;
import br.com.ecoded.dirf.bo.blocoDIRF.GerarBlocoDIRF;
import br.com.ecoded.dirf.bo.blocoFIMDIRF.GerarBlocoFIMDIRF;
import br.com.ecoded.dirf.bo.blocoIDREC.GerarBlocoIDREC;
import br.com.ecoded.dirf.bo.blocoRESPO.GerarBlocoRESPO;
import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.util.Util;

public class GerarDirf {

	public static StringBuilder gerar(Dirf dirf, StringBuilder sb) {

		if (!Util.isEmpty(dirf.getBlocoDIRF())) {
			GerarBlocoDIRF.gerar(dirf, sb);
		}

		if (!Util.isEmpty(dirf.getBlocoRESPO())) {
			GerarBlocoRESPO.gerar(dirf, sb);
		}

		if (!Util.isEmpty(dirf.getBlocoDECPJ())) {
			GerarBlocoDECPJ.gerar(dirf, sb);
		}

		if (!Util.isEmpty(dirf.getBlocoIDREC())) {
			GerarBlocoIDREC.gerar(dirf, sb);
		}

//		if (!Util.isEmpty(dirf.getBlocoBPJDEC())) {
//			GerarBlocoBPJDEC.gerar(dirf, sb);
//		}

//		if (!Util.isEmpty(dirf.getBlocoRTRT())) {
//			GerarBlocoRTRT.gerar(dirf, sb);
//		}

//		if (!Util.isEmpty(dirf.getBlocoRTIRF())) {
//			GerarBlocoRTIRF.gerar(dirf, sb);
//		}

		if (!Util.isEmpty(dirf.getBlocoFIMDIRF())) {
			GerarBlocoFIMDIRF.gerar(dirf, sb);
		}

		// Nova Linha ao Final do Arquivo:
		sb.append(System.lineSeparator());

		return sb;
	}
}