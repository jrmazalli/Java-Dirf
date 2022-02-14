package br.com.ecoded.dirf.bo.blocoDECPJ;

import br.com.ecoded.dirf.registros.blocoDECPJ.RegistroDECPJ;
import br.com.ecoded.dirf.util.Util;

public class GerarRegistroDECPJ {

	public static StringBuilder gerar(RegistroDECPJ registroDECPJ, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getNome_empresarial()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getNatureza_declarante()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getCpf_resp_perant_cnpj()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_scp()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_decl_inst_adm_interm_fund_clib_invest()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_decl_rend_pag_resid_domic_ext()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_plan_priv_assist_saud()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_ent_uni_det_pag_val_ent_imu_isent()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_fund_publ_dir_priv()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getInd_sit_espc_decl()));
		sb.append("|").append(Util.preencheRegistro(registroDECPJ.getData_evento()));
		sb.append("|").append('\n');

		return sb;
	}
}
