package com.myproject.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.models.Cart;
import com.myproject.models.Product;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {

//	public Map<Product,Integer> findbyName(String productName);
//	public Cart findbyId(Integer cartId);
}
