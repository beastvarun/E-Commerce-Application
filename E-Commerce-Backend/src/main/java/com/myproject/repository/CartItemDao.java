package com.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.models.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
