package com.amos.chain.sencond;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
	public List<Filter> filters = new ArrayList<Filter>();

	public List<Filter> getFilters() {
		return filters;
	}

	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}

	public FilterChain addFilter(Filter f) {
		filters.add(f);
		return this;
	}

	// @Override
	// public String doFilter(String msg) {
	// String result = "";
	// for (Filter f : filters) {
	// result += f.doFilter(msg);
	// }
	// return result;
	// }

	int index = 0;

	@Override
	public void doFilter(Request request, Response response,FilterChain fc) {
		if (index == filters.size())
			return;
		filters.get(index++).doFilter(request, response, fc);
	}

}
