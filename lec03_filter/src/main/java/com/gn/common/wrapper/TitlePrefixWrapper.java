package com.gn.common.wrapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class TitlePrefixWrapper extends HttpServletRequestWrapper {

	public TitlePrefixWrapper(HttpServletRequest request) {
		super(request);
		
	}
	
	@Override
	public String getParameter(String name) {
		if (name.equals("title")) {
			return "[공지]" + super.getParameter(name);
		} else {
			return super.getParameter(name);
		}
	}
	

}
