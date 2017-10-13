package com.yym.aha.algorithms.jjwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

/**
 * Created by yaoyimin on 2017/7/12.
 */
public abstract class JwtUtils {

	private final static String SECRET = "yym";

	public static String generateToken(Map<String,Object> claims){
		return Jwts.builder()
				.setClaims(claims)
				.setExpiration(new Date(new Date().getTime()+86400000))
				.signWith(SignatureAlgorithm.HS512,SECRET)
				.compact();
	}


	public static Claims getMap(String token)throws ExpiredJwtException {
		Claims claims = null;
		claims = Jwts.parser()
					.setSigningKey(SECRET)
					.parseClaimsJws(token)
					.getBody();
		return claims;
	}
}
