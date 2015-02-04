package com.amos.first;

public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String msg) {

		return msg + "---SensitiveFilter";
	}

}
