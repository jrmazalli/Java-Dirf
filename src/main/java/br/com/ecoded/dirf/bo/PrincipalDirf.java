package br.com.ecoded.dirf.bo;

import br.com.ecoded.dirf.registros.blocoBPJDEC.BlocoBPJDEC;
import br.com.ecoded.dirf.registros.blocoBPJDEC.RegistroBPJDEC;
import br.com.ecoded.dirf.registros.blocoDECPJ.BlocoDECPJ;
import br.com.ecoded.dirf.registros.blocoDECPJ.RegistroDECPJ;
import br.com.ecoded.dirf.registros.blocoDIRF.BlocoDIRF;
import br.com.ecoded.dirf.registros.blocoDIRF.RegistroDIRF;
import br.com.ecoded.dirf.registros.blocoFIMDIRF.BlocoFIMDIRF;
import br.com.ecoded.dirf.registros.blocoFIMDIRF.RegistroFIMDIRF;
import br.com.ecoded.dirf.registros.blocoIDREC.BlocoIDREC;
import br.com.ecoded.dirf.registros.blocoIDREC.RegistroIDREC;
import br.com.ecoded.dirf.registros.blocoRESPO.BlocoRESPO;
import br.com.ecoded.dirf.registros.blocoRESPO.RegistroRESPO;
import br.com.ecoded.dirf.registros.blocoRTIRF.BlocoRTIRF;
import br.com.ecoded.dirf.registros.blocoRTIRF.RegistroRTIRF;
import br.com.ecoded.dirf.registros.blocoRTRT.BlocoRTRT;
import br.com.ecoded.dirf.registros.blocoRTRT.RegistroRTRT;

public class PrincipalDirf {

	// BLOCO DIRF
	public static BlocoDIRF preencheBlocoDirf() {
		BlocoDIRF blocoDirf = new BlocoDIRF();
		blocoDirf = preencheRegistroDIRF(blocoDirf);

		return blocoDirf;
	}

	public static BlocoDIRF preencheRegistroDIRF(BlocoDIRF blocoDirf) {
		RegistroDIRF registroDirf = new RegistroDIRF();
		registroDirf.setAno_referencia("2021");
		registroDirf.setAno_calendario("2022");
		registroDirf.setInd_retificadora("");
		registroDirf.setNum_recibo_anterior("");
		registroDirf.setInd_estrutura_leiaute("");
		blocoDirf.setRegistroDIRF(registroDirf);

		return blocoDirf;
	}

	// BLOCO RESPO
	public static BlocoRESPO preencheBlocoRespo() {
		BlocoRESPO blocoRespo = new BlocoRESPO();
		blocoRespo = preencheRegistroRESPO(blocoRespo);

		return blocoRespo;
	}

	public static BlocoRESPO preencheRegistroRESPO(BlocoRESPO blocoRespo) {
		RegistroRESPO registroRespo = new RegistroRESPO();
		registroRespo.setCpf("");
		registroRespo.setNome("");
		registroRespo.setDdd("");
		registroRespo.setTelefone("");
		registroRespo.setRamal("");
		registroRespo.setFax("");
		registroRespo.setEmail("");
		blocoRespo.setRegistroRESPO(registroRespo);

		return blocoRespo;

	}

	// BLOCO DECPJ
	public static BlocoDECPJ preencheBlocoDecpj() {
		BlocoDECPJ blocoDecpj = new BlocoDECPJ();
		blocoDecpj = preecheRegistroDECPJ(blocoDecpj);

		return blocoDecpj;
	}

	public static BlocoDECPJ preecheRegistroDECPJ(BlocoDECPJ blocoDecpj) {
		RegistroDECPJ registroDecpj = new RegistroDECPJ();
		registroDecpj.setCnpj("");
		registroDecpj.setNome_empresarial("");
		registroDecpj.setNatureza_declarante("");
		registroDecpj.setCpf_resp_perant_cnpj("");
		registroDecpj.setInd_scp("");
		registroDecpj.setInd_decl_dep_cred_dec_decs_jud("");
		registroDecpj.setInd_decl_inst_adm_interm_fund_clib_invest("");
		registroDecpj.setInd_decl_rend_pag_resid_domic_ext("");
		registroDecpj.setInd_plan_priv_assist_saud("");
		registroDecpj.setInd_ent_uni_det_pag_val_ent_imu_isent("");
		registroDecpj.setInd_fund_publ_dir_priv("");
		registroDecpj.setInd_sit_espc_decl("");
		registroDecpj.setData_evento("");
		blocoDecpj.setRegistroDECPJ(registroDecpj);

		return blocoDecpj;

	}

	// BLOCO IDREC
	public static BlocoIDREC preencheBlocoIdrec() {
		BlocoIDREC blocoIdrec = new BlocoIDREC();
		blocoIdrec = preencheRegistroIDREC(blocoIdrec);

		return blocoIdrec;
	}

	public static BlocoIDREC preencheRegistroIDREC(BlocoIDREC blocoIdrec) {
		RegistroIDREC registroIdrec = new RegistroIDREC();
		registroIdrec.setCod_receita("");
		blocoIdrec.setRegistroIDREC(registroIdrec);

		return blocoIdrec;

	}

	// BLOCO BPJDEC
	public static BlocoBPJDEC preencheBlocoBpjdec() {
		BlocoBPJDEC blocoBpjdec = new BlocoBPJDEC();
		blocoBpjdec = preencheRegistroBPJDEC(blocoBpjdec);

		return blocoBpjdec;
	}

	public static BlocoBPJDEC preencheRegistroBPJDEC(BlocoBPJDEC blocoBpjdec) {
		RegistroBPJDEC registroBpjdec = new RegistroBPJDEC();
		registroBpjdec.setCnpj("");
		registroBpjdec.setNome_empresarial("");
		blocoBpjdec.setRegistroBPJDEC(registroBpjdec);

		return blocoBpjdec;

	}

	// BLOCO RTRT
	public static BlocoRTRT preencheBlocoRtrt() {
		BlocoRTRT blocoRtrt = new BlocoRTRT();
		blocoRtrt = preencheRegistroRTRT(blocoRtrt);

		return blocoRtrt;
	}

	public static BlocoRTRT preencheRegistroRTRT(BlocoRTRT blocoRtrt) {
		RegistroRTRT registroRtrt = new RegistroRTRT();
		registroRtrt.setJaneiro("");
		registroRtrt.setFevereiro("");
		registroRtrt.setMarco("");
		registroRtrt.setAbril("");
		registroRtrt.setMaio("");
		registroRtrt.setJunho("");
		registroRtrt.setJulho("");
		registroRtrt.setAgosto("");
		registroRtrt.setSetembro("");
		registroRtrt.setOutubro("");
		registroRtrt.setNovembro("");
		registroRtrt.setDezembro("");
		registroRtrt.setDecimo_terceiro("");
		blocoRtrt.setRegistroRTRT(registroRtrt);

		return blocoRtrt;

	}

	// BLOCO RTIRF
	public static BlocoRTIRF preencheBlocoRtirf() {
		BlocoRTIRF blocoRtirf = new BlocoRTIRF();
		blocoRtirf = preencheRegistroRTIRF(blocoRtirf);

		return blocoRtirf;
	}

	public static BlocoRTIRF preencheRegistroRTIRF(BlocoRTIRF blocoRtirf) {
		RegistroRTIRF registroRtirf = new RegistroRTIRF();
		registroRtirf.setJaneiro("");
		registroRtirf.setFevereiro("");
		registroRtirf.setMarco("");
		registroRtirf.setAbril("");
		registroRtirf.setMaio("");
		registroRtirf.setJunho("");
		registroRtirf.setJulho("");
		registroRtirf.setAgosto("");
		registroRtirf.setSetembro("");
		registroRtirf.setOutubro("");
		registroRtirf.setNovembro("");
		registroRtirf.setDezembro("");
		registroRtirf.setDecimo_terceiro("");
		blocoRtirf.setRegistroRTIRF(registroRtirf);

		return blocoRtirf;

	}

	// BLOCO FIMDIRF
	public static BlocoFIMDIRF preencheBlocoFimDirf() {
		BlocoFIMDIRF blocoFimDirf = new BlocoFIMDIRF();
		blocoFimDirf = preencheRegistroFIMDIRF(blocoFimDirf);

		return blocoFimDirf;
	}

	public static BlocoFIMDIRF preencheRegistroFIMDIRF(BlocoFIMDIRF blocoFimdirf) {
		RegistroFIMDIRF registroFimdirf = new RegistroFIMDIRF();
		blocoFimdirf.setRegistroFIMDIRF(registroFimdirf);

		return blocoFimdirf;
	}

}
