package br.com.ecoded.dirf.bo;

import br.com.ecoded.dirf.exception.DirfException;
import br.com.ecoded.dirf.registros.Dirf;
import br.com.ecoded.dirf.util.Util;

public class GerarArquivoDirf {

	public static void main(String[] args) {

		try {
			StringBuilder sb = new StringBuilder();
			Dirf dirf = new Dirf();
			dirf.setBlocoDIRF(PrincipalDirf.preencheBlocoDirf());
			dirf.setBlocoRESPO(PrincipalDirf.preencheBlocoRespo());
			dirf.setBlocoDECPJ(PrincipalDirf.preencheBlocoDecpj());
			dirf.setBlocoIDREC(PrincipalDirf.preencheBlocoIdrec());
			dirf.setBlocoBPJDEC(PrincipalDirf.preencheBlocoBpjdec());
			dirf.setBlocoRTRT(PrincipalDirf.preencheBlocoRtrt());
			dirf.setBlocoRTIRF(PrincipalDirf.preencheBlocoRtirf());
			dirf.setBlocoFIMDIRF(PrincipalDirf.preencheBlocoFimDirf());
			
			sb = GerarDirf.gerar(dirf, sb);
			
			System.out.println("       GERAÇÃO DIRF          ");
			System.out.println(" ");
			System.out.println(sb.toString());
			Util.criarPastaArquivo("C:/DIRF", "dirf.txt", sb.toString());
			System.out.println("Arquivo criado na pasta: C:/DIRF ");
			
			
		}catch (DirfException e) {
			System.err.println();
			System.err.println("Erro: " + e.getMessage());
		}
		
	}

}
