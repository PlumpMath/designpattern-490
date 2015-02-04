package com.amos.test;

import com.amos.sencond.FilterChain;
import com.amos.sencond.HTMLFilter;
import com.amos.sencond.Request;
import com.amos.sencond.Response;
import com.amos.sencond.SensitiveFilter;

public class MainSecond {
	public static void main(String[] args) {
		String msg = "request...";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response...");

		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
		fc.doFilter(request, response, fc);
		
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());

	}
}
