package com.amos.sencond;

public interface Filter {
	void  doFilter(Request request,Response response,FilterChain fc);
}
