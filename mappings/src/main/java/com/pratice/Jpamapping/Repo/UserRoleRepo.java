package com.pratice.Jpamapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Jpamapping.Entity.User;
@Repository
public interface UserRoleRepo extends JpaRepository<User, Integer> {

}
