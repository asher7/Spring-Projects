package com.pratice.Jpamapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Jpamapping.Entity.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer> {

}
