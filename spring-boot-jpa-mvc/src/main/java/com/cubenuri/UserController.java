package com.cubenuri;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cubenuri.dao.UserDao;
import com.cubenuri.domain.AuthInfo;
import com.cubenuri.domain.UserInfo;

@RepositoryRestController

public class UserController {



	@Autowired

	private UserDao userDao;

	

	@GetMapping("/userInfoes/{index}")

	public @ResponseBody UserInfo get(HttpServletRequest req , @PathVariable long index) {

		return userDao.findOne(index);

	}

	

	@PostMapping("/userInfoes")

	public @ResponseBody UserInfo create(HttpServletRequest req , UserInfo user) {

		System.out.println("call crete!!!!!");
		AuthInfo aInfo = new AuthInfo();
		
		
		aInfo.setNmAuth("applyList");
		
		aInfo.setUserInfo(user);
		
		user.getAuthList().add(aInfo);
		
		
		
		return userDao.save(user);		
				 

	}

}


