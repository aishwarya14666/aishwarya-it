package com.example;

public class ExceptionInfo {
	
	private String msg;
	private String code;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ExceptionInfo [msg=" + msg + ", code=" + code + "]";
	}

}
