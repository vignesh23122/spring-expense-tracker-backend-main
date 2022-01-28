package com.srivignesh.springexpensetracker.jwt;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	 	/**
	 * 
	 */
	private static final long serialVersionUID = 9181499222272574726L;
	private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }

    public String getJwt() {
        return token;
    }
	
}
