package com.cubenuri.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="USER")
@RepositoryRestController

public class UserInfo implements Serializable {

	
	private static final long serialVersionUID = -9205061201069252155L;

	@Id
	@Column(name="seq")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long seq;
	

	@Column
	private String name;
	
	@JsonIgnoreProperties("userInfo")
	@OneToMany(mappedBy = "userInfo", cascade = { CascadeType.PERSIST})
	private List<AuthInfo> authList = new ArrayList<>();


	public long getSeq() {
		return seq;
	}


	public void setSeq(long seq) {
		this.seq = seq;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public List<AuthInfo> getAuthList() {
		return authList;
	}



	
	
	
	
	
}


