package org.mybatis.example;

/**
 * 作者POJO类
 * 
 * @author 大强
 *
 */
public class Author {

	public int authorid;
	public String username;
	public String password;
	public String email;
	public String bio;
	public String favouriteSection;
	
	
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getFavouriteSection() {
		return favouriteSection;
	}
	public void setFavouriteSection(String favouriteSection) {
		this.favouriteSection = favouriteSection;
	}
	
}
