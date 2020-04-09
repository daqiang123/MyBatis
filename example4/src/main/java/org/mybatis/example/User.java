package org.mybatis.example;

/**
 * 用户POJO类
 * 
 * @author 大强
 *
 */
public class User {

	public int id;
	public String username;
	public String password;
	// public String hashedPassword;
	public String email;
	
//	public User(Integer id, String username, String password) {
//		super();
//		this.id = id;
//		this.username = username;
//		this.password = password;
//	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/*
	public String getHashedPassword() {
		return hashedPassword;
	}
	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}*/
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
