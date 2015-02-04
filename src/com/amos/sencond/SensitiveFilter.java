package com.amos.sencond;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain fc) {
		request.requestStr += "---SensitiveFilter ";
		fc.doFilter(request, response, fc);
		response.responseStr+="---SensitiveFilter";
	}
}
