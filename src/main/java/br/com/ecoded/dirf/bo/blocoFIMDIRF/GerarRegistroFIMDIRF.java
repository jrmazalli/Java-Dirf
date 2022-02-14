package br.com.ecoded.dirf.bo.blocoFIMDIRF;

import br.com.ecoded.dirf.registros.blocoFIMDIRF.RegistroFIMDIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroFIMDIRF {

	public static StringBuilder gerar(RegistroFIMDIRF registroFIMDIRF, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroFIMDIRF.getReg()));
		sb.append("|").append('\n');

		return sb;
	}
}
