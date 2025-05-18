package com.myproject.service;

import java.util.List;

import com.myproject.controller.ProductNotFound;
import com.myproject.exception.CartItemNotFound;
import com.myproject.models.Cart;
import com.myproject.models.CartDTO;
import com.myproject.models.CartItem;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFound;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
