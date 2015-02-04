package com.amos.test;

import com.amos.first.FilterChain;
import com.amos.first.HTMLFilter;
import com.amos.first.SensitiveFilter;

public class MainFirst {
	public static void main(String[] args) {
		String msg = "teststring";
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		.addFilter(new SensitiveFilter());
//		fc.filters.add(new HTMLFilter());
//		fc.filters.add(new SensitiveFilter());

		msg = fc.doFilter(msg);
		System.out.println("msg:" + msg);
	}
}
