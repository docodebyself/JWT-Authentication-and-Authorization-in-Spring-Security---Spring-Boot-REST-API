package com.spring.jwt.jwt;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class JwtConfig {

    @Value("${jwt.url:/login}")
    private String url;

    @Value("${jwt.header:Authorization}")
    private String header;

    @Value("${jwt.prefix:Bearer}")
    private String prefix;

    @Value("${jwt.expiration:#{60*60}}")
    private int expiration;

    @Value("${jwt.secret:3979244226452948404D6251655468576D5A7134743777217A25432A462D4A61}")
    private String secret;
}
