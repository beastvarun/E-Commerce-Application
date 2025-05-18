package com.myproject.service;

import com.myproject.models.CartDTO;
import com.myproject.models.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
