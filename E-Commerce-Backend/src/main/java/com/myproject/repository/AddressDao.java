package com.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.models.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer>{

}
