package com.pratice.Jpamapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Jpamapping.Entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

	
}
