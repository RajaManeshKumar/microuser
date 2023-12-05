package com.user.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entites.User;
import com.user.exceptionhandler.ResourseNotFound;
import com.user.repo.UserRepo;
import com.user.service.UserService;
@Service
public class UserServiceImp implements UserService {
	
	@Autowired	
	UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		
		String id=UUID.randomUUID().toString();
		user.setUserId(id);
				User userDat=  userRepo.save(user);
		// TODO Auto-generated method stub
					
					return userDat;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> getAll=userRepo.findAll();
		return getAll;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow(()-> new ResourseNotFound("User not found"+userId));
			}

}
