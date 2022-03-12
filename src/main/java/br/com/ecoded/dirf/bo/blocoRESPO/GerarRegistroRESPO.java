package br.com.ecoded.dirf.bo.blocoRESPO;

import br.com.ecoded.dirf.registros.blocoRESPO.RegistroRESPO;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroRESPO {

	public static StringBuilder gerar(RegistroRESPO registroRESPO, StringBuilder sb) {

		sb.append("").append(Util.preencheRegistro(registroRESPO.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getCpf()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getDdd()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getTelefone()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getRamal()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getFax()));
		sb.append("|").append(Util.preencheRegistro(registroRESPO.getEmail()));
		sb.append("|").append('\n');

		return sb;
	}
}
