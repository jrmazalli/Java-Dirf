package br.com.ecoded.dirf.util;

import java.io.File;
import java.io.FileWriter;
import java.util.Collection;

import br.com.ecoded.dirf.exception.DirfException;
import br.com.ecoded.dirf.registros.Dirf;

public final class Util {

	private final static String dataVersao2020 = "2020";
	private final static String dataVersao2021 = "2021";
	private final static String dataVersao2022 = "2022";

	/**
	 * Construtor privado para garantir o Singleton.
	 */
	private Util() {

	}

	/**
	 * Verifica se um objeto está vazio.
	 * 
	 * @param obj
	 * @return <b>true</b> se o objeto for vazio(empty).
	 */
    public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof Collection)
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}
    
    /**
	 * Preenche o Registro
	 * 
	 * @param String
	 */
    public static String preencheRegistro(String string) {
    	return Util.isEmpty(string)? "" : string;
	}
    
    /**
     * Cria um arquivo com os dados passados 
     * @throws Exception 
     */
    public static void criarPastaArquivo(String pasta, String arquivo , String conteudo ) throws DirfException {
    	
    	File folder = new File(pasta);
    	if(!folder.exists()){
    		folder.mkdirs();
    	}
    	
    	FileWriter fileWriter;
    	try {
    		fileWriter = new FileWriter(new File(pasta+"/"+arquivo));
    		fileWriter.write(conteudo);
    		fileWriter.close();
    	} catch (Exception e) {
    		throw new DirfException("Erro ao Criar Arquivo "+e.getMessage());    		
    	}
    }

	private static String ano(String dataStr) { // LocalDate strToDate(String dataStr) {
		return dataStr;
	}


	public static boolean versao2020(String dataStr) {
		return ano(dataStr).contains(dataVersao2020);
	}
	
	public static boolean versao2021(String dataStr) {
		return ano(dataStr).contains(dataVersao2021);
	}
	
	public static boolean versao2022(String dataStr) {
		return ano(dataStr).contains(dataVersao2022);
	}
	


	public static String getCodLeiaute(Dirf dirf) {
		if (versao2021(dirf.getBlocoDIRF().getRegistroDIRF().getAno_referencia())) {
			return "XJFSFHB";
		} else if (versao2020(dirf.getBlocoDIRF().getRegistroDIRF().getAno_referencia())) {
			return "VR4QLM8";
		} else {
			return "--";
		}
	}
    
   
}