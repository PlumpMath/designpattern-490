package com.amos.first;

public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String msg) {
		return msg + "---HTMLFilter";
	}

}
