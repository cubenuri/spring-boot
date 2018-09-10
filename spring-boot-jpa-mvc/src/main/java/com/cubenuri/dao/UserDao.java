package com.cubenuri.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubenuri.domain.UserInfo;

public interface UserDao extends JpaRepository<UserInfo, Long> {
	 
}
