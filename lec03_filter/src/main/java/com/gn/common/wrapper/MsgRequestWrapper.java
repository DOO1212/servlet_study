package com.gn.common.wrapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class MsgRequestWrapper extends HttpServletRequestWrapper {

	public MsgRequestWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if(name.equals("msg") && value != null) {
			return value.replaceAll("shit", "****");
		}
		return value;
	}

	
	
}
