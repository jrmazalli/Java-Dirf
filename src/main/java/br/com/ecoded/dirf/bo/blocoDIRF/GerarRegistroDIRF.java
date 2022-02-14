package br.com.ecoded.dirf.bo.blocoDIRF;

import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoDIRF.RegistroDIRF;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroDIRF {

public static StringBuilder gerar(Dirf dirf,RegistroDIRF registroDIRF, StringBuilder sb){
		
		sb.append("|").append(Util.preencheRegistro(registroDIRF.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroDIRF.getAno_referencia()));
		sb.append("|").append(Util.preencheRegistro(registroDIRF.getAno_calendario()));
		sb.append("|").append(Util.preencheRegistro(registroDIRF.getInd_retificadora()));
		sb.append("|").append(Util.preencheRegistro(registroDIRF.getNum_recibo_anterior()));
		sb.append("|").append(Util.preencheRegistro(Util.getCodLeiaute(dirf)));
		
    	sb.append("|").append('\n');
		
		return sb;
	}
}
