package com.example.demo.c04cinema.c04cinema.c04cinema.account;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Key;
import java.util.*;

import static java.util.Collections.emptyList;
import static java.util.Collections.unmodifiableSet;

public class TokenAuthenticator {
    private static final long EXPIRATION_TIME = 7 * 24 * 60 * 60 * 1000;  // 7 days
    private static final String AUTH_HEADER_STRING = "Authorization";
//    private static final String TOKEN_PREFIX = "Token";
    private static final String SECRET = "OurSecret";
    private static final String PG_CLAIM_LABEL = "PG";

    static String secret = "asdfSFS34wfsdfsdfSDSD32dfsddDddfdfdDerQSNCK34SOWEK5354fdgdf4";

    static Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret),
            SignatureAlgorithm.HS256.getJcaName());

    static String addAuthentication(HttpServletResponse res,int accountId, String userName, String autorizations) {

//        List<String> pgRatings = autorizations.stream()
//                .filter(s -> s.startsWith(PG_CLAIM_LABEL))
//                .collect(Collectors.toList());

        String jwt = Jwts.builder()
                .setSubject(userName)
                .claim(PG_CLAIM_LABEL, "admin")
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(hmacKey)
                .compact();

//        res.addHeader(AUTH_HEADER_STRING, jwt);
        return jwt;
    }

    static Authentication getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(AUTH_HEADER_STRING);
//        String abc="aaaa";
        if (token != null) {
            Jws<Claims> jwt = Jwts.parserBuilder()
                    .setSigningKey(hmacKey)
                    .build()
                    .parseClaimsJws(token);

            Claims body = jwt.getBody();
            String userName = body.getSubject();

            final String credentials =  body.get(PG_CLAIM_LABEL).toString();
            return userName != null ?
                    new UsernamePasswordAuthenticationToken(userName, credentials, emptyList()) :
                    null;
        }
        return null;
    }
}
