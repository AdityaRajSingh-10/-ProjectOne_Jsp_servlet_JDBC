package com.model;

public class User {
	
	private Integer id;
	private String name;
	private String password;
	private String email;
	private Long mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "User [id-" + id + ", name-" + name + ", password-" + password + ", email-" + email + ", mobile-"
				+ mobile + "]";
	}
	
	

}