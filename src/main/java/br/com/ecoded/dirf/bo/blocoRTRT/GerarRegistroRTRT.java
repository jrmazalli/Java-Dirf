package br.com.ecoded.dirf.bo.blocoRTRT;

import br.com.ecoded.dirf.registros.blocoRTRT.RegistroRTRT;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroRTRT {

	public static StringBuilder gerar(RegistroRTRT registroRTRT, StringBuilder sb) {

		sb.append("").append(Util.preencheRegistro(registroRTRT.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getJaneiro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getFevereiro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getMarco()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getAbril()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getMaio()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getJunho()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getJulho()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getAgosto()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getSetembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getOutubro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getNovembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getDezembro()));
		sb.append("|").append(Util.preencheRegistro(registroRTRT.getDecimo_terceiro()));
		sb.append("|").append('\n');

		return sb;
	}
}
