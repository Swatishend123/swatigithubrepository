package com.nt.controller;
public class MyException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s1;

	 MyException(String s1) {
		this.s1 = s1;
	}

	@Override
	public String toString() {
		return ("MyException"+s1);
	}
	

}
