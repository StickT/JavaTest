package com.yym.aha.algorithms.jjwt;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaoyimin on 2017/10/13
 */
public class JwtTest {

	public static void main(String[] args){
		Map<String,Object> map = new HashMap();
		int i = 0;
		while (i <= 100){
			map.put(String.valueOf(i),"yym");
			i++;
		}
		String token = JwtUtils.generateToken(map);

		System.out.println(token);

	}
}
