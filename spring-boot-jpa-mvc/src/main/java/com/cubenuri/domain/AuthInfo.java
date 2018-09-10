package com.cubenuri.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="AUTH")
public class AuthInfo implements Serializable {

	
	private static final long serialVersionUID = -9205061201069252155L;

	@Id
	@Column(name="seq")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;
	

	@Column
	private String nmAuth;


	@ManyToOne
	private UserInfo userInfo;

	public long getSeq() {
		return seq;
	}


	public void setSeq(long seq) {
		this.seq = seq;
	}


	public String getNmAuth() {
		return nmAuth;
	}


	public void setNmAuth(String nmAuth) {
		this.nmAuth = nmAuth;
	}


	public UserInfo getUserInfo() {
		return userInfo;
	}


	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	


	
}


