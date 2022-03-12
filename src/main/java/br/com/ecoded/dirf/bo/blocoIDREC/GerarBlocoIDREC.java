package br.com.ecoded.dirf.bo.blocoIDREC;

import java.util.ArrayList;
import java.util.List;

import br.com.ecoded.dirf.bo.blocoBPJDEC.GerarRegistroBPJDEC;
import br.com.ecoded.dirf.bo.blocoRTIRF.GerarRegistroRTIRF;
import br.com.ecoded.dirf.bo.blocoRTRT.GerarRegistroRTRT;
import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.registros.blocoIDREC.BlocoIDREC;
import br.com.ecoded.dirf.registros.blocoIDREC.RegistroIDREC;
import br.com.ecoded.dirf.util.Util;

public class GerarBlocoIDREC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(Dirf dirf, StringBuilder sbr) {
		BlocoIDREC blocoIDREC = dirf.getBlocoIDREC();
		sb = sbr;

		if (!Util.isEmpty(blocoIDREC.getRegistroIDREC())) {
			
			List<RegistroIDREC> codRegra17 = new ArrayList<>();
			List<RegistroIDREC> codRegra18 = new ArrayList<>();
			
			blocoIDREC.getRegistroIDREC().forEach(registroIDREC -> {
				if ("1708".equals(registroIDREC.getCod_receita())) {
					codRegra17.add(registroIDREC);
				} else if ("5952".equals(registroIDREC.getCod_receita())) {
					codRegra18.add(registroIDREC);
				}
			});

			RegistroIDREC idRec = new RegistroIDREC();
			idRec.setCod_receita("1708");
			GerarRegistroIDREC.gerar(idRec, sb);
			
			for (RegistroIDREC registro: codRegra17) {
				GerarRegistroBPJDEC.gerar(registro.getRegistroBPJDEC(), sb);
				GerarRegistroRTRT.gerar(registro.getRegistroRTRT(), sb);
				GerarRegistroRTIRF.gerar(registro.getRegistroRTIRF(), sb);
			}
			
			idRec = new RegistroIDREC();
			idRec.setCod_receita("5952");
			GerarRegistroIDREC.gerar(idRec, sb);
			
			for (RegistroIDREC registro: codRegra18) {
				GerarRegistroBPJDEC.gerar(registro.getRegistroBPJDEC(), sb);
				GerarRegistroRTRT.gerar(registro.getRegistroRTRT(), sb);
				GerarRegistroRTIRF.gerar(registro.getRegistroRTIRF(), sb);
			}
			
		}
		return sb;
	}
}
