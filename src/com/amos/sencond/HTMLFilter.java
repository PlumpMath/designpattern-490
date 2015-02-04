package com.amos.sencond;

public class HTMLFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain fc) {
		request.requestStr += "---HTMLFilter";
		fc.doFilter(request, response, fc);
		response.responseStr += "---HTMLFilter";
	}

}
