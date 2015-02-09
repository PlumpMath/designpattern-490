package com.amos.chain.sencond;

public interface Filter {
	void  doFilter(Request request,Response response,FilterChain fc);
}
