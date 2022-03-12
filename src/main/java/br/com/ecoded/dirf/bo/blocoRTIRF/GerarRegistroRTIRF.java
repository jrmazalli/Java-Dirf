package br.com.ecoded.dirf.bo.blocoRTIRF;

import br.com.ecoded.dirf.registros.blocoRTIRF.RegistroRTIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroRTIRF {

	public static StringBuilder gerar(RegistroRTIRF registroRTIRF, StringBuilder sb) {

		sb.append("").append(Util.preencheRegistro(registroRTIRF.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getJaneiro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getFevereiro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getMarco()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getAbril()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getMaio()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getJunho()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getJulho()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getAgosto()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getSetembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getOutubro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getNovembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getDezembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTIRF.getDecimo_terceiro()));
		sb.append("|").append('\n');

		return sb;
	}
}
