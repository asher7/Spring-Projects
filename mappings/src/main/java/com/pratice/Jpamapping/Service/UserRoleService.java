package com.pratice.Jpamapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.Jpamapping.Entity.Roles;
import com.pratice.Jpamapping.Entity.User;
import com.pratice.Jpamapping.Repo.RoleUsersRepo;
import com.pratice.Jpamapping.Repo.UserRoleRepo;

@Service
public class UserRoleService {
	
	@Autowired
	private UserRoleRepo userRoleRepo;
	
	@Autowired
	private RoleUsersRepo roleUsersRepo;
	
	
	public User insert(User user)
	{
		return userRoleRepo.save(user);
	}

	public List<User> get()
	{
		return userRoleRepo.findAll();
	}
	
	public List<Roles> getRole()
	{
		return roleUsersRepo.findAll();
	}
}
