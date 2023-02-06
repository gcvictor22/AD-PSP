package com.salesianostriana.dam.registrologin.security.jwt.refresh;

import com.salesianostriana.dam.registrologin.security.errorhandling.JwtTokenException;

public class RefreshTokenException extends JwtTokenException {

    public RefreshTokenException(String msg) {
        super(msg);
    }

}


