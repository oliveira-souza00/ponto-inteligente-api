package com.sts.pontointeligente.api.entities;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder ;


public class SenhaUtils {
	/**
	 * 
	 * Gera um hash o Bcrypt
	 * @param senha
	 * @return String
	 */
		
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
			return bCryptEncoder.encode(senha);
		}
		
	/**
	 * Verifica se a senha é válida;
	 * @param senha
	 * @param senhaEnconder
	 * @return boolean
	 */
	
	public static boolean senhaValida(String senha, String senhaEncode) {
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
		
		return bCryptEncoder.mathes(senha,senhaEncode);
		
	
		
	
	}
	
	

}
