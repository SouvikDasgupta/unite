package com.unite.auth.util;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordEncryptDcrypter {
	
	public static String encryptPassword(final String password) {
		String encryptedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
		return encryptedPassword;
	}
}
