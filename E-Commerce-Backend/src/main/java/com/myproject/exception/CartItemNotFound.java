package com.myproject.exception;

public class CartItemNotFound extends RuntimeException{

	public CartItemNotFound() {
		// TODO Auto-generated constructor stub
	}
	
	public CartItemNotFound(String message) {
		super(message);
	}
}
