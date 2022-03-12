package br.com.ecoded.dirf.registros;

import br.com.ecoded.dirf.registros.blocoBPJDEC.BlocoBPJDEC;
import br.com.ecoded.dirf.registros.blocoDECPJ.BlocoDECPJ;
import br.com.ecoded.dirf.registros.blocoDIRF.BlocoDIRF;
import br.com.ecoded.dirf.registros.blocoFIMDIRF.BlocoFIMDIRF;
import br.com.ecoded.dirf.registros.blocoIDREC.BlocoIDREC;
import br.com.ecoded.dirf.registros.blocoRESPO.BlocoRESPO;
import br.com.ecoded.dirf.registros.blocoRTIRF.BlocoRTIRF;
import br.com.ecoded.dirf.registros.blocoRTRT.BlocoRTRT;

public class Dirf {

	private BlocoDIRF blocoDIRF;
	private BlocoRESPO blocoRESPO;
	private BlocoDECPJ blocoDECPJ;
	private BlocoIDREC blocoIDREC;
	private BlocoBPJDEC blocoBPJDEC;
	private BlocoRTRT blocoRTRT;
	private BlocoRTIRF blocoRTIRF;
	private BlocoFIMDIRF blocoFIMDIRF;

	public BlocoDIRF getBlocoDIRF() {
		return blocoDIRF;
	}

	public void setBlocoDIRF(BlocoDIRF blocoDIRF) {
		this.blocoDIRF = blocoDIRF;
	}

	public BlocoRESPO getBlocoRESPO() {
		return blocoRESPO;
	}

	public void setBlocoRESPO(BlocoRESPO blocoRESPO) {
		this.blocoRESPO = blocoRESPO;
	}

	public BlocoDECPJ getBlocoDECPJ() {
		return blocoDECPJ;
	}

	public void setBlocoDECPJ(BlocoDECPJ blocoDECPJ) {
		this.blocoDECPJ = blocoDECPJ;
	}

	public BlocoIDREC getBlocoIDREC() {
		return blocoIDREC;
	}

	public void setBlocoIDREC(BlocoIDREC blocoIDREC) {
		this.blocoIDREC = blocoIDREC;
	}
	
	
//	public List<BlocoIDREC> getBlocoIDREC() {
//		if (blocoIDREC == null) {
//			blocoIDREC = new ArrayList<BlocoIDREC>();
//		}
//		return blocoIDREC;
//	}
//
//	public void setBlocoIDREC(List<BlocoIDREC> blocoIDREC) {
//		this.blocoIDREC = blocoIDREC;
//	}
	

	public BlocoBPJDEC getBlocoBPJDEC() {
		return blocoBPJDEC;
	}

	public void setBlocoBPJDEC(BlocoBPJDEC blocoBPJDEC) {
		this.blocoBPJDEC = blocoBPJDEC;
	}

	public BlocoRTRT getBlocoRTRT() {
		return blocoRTRT;
	}

	public void setBlocoRTRT(BlocoRTRT blocoRTRT) {
		this.blocoRTRT = blocoRTRT;
	}

	public BlocoRTIRF getBlocoRTIRF() {
		return blocoRTIRF;
	}

	public void setBlocoRTIRF(BlocoRTIRF blocoRTIRF) {
		this.blocoRTIRF = blocoRTIRF;
	}

	public BlocoFIMDIRF getBlocoFIMDIRF() {
		return blocoFIMDIRF;
	}

	public void setBlocoFIMDIRF(BlocoFIMDIRF blocoFIMDIRF) {
		this.blocoFIMDIRF = blocoFIMDIRF;
	}

}
