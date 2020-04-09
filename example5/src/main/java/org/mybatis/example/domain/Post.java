package org.mybatis.example.domain;

import java.util.Date;

/**
 * 文章POJO类
 * @author 大强
 *
 */
public class Post {

	public int id;
	public int blogId;
	public int authorId;
	public Date createdOn;
	public String section;
	public String subject;
	public String draft;
	public String body;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDraft() {
		return draft;
	}
	public void setDraft(String draft) {
		this.draft = draft;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}	
	
}
