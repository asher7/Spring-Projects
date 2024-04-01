package com.pratice.Jpamapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Jpamapping.Entity.Roles;

@Repository
public interface RoleUsersRepo extends JpaRepository<Roles, Long> {

}
