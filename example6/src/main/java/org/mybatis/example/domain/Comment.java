package org.mybatis.example.domain;

/**
 * 评论POJO类
 * 
 * @author 大强
 *
 */
public class Comment {

	public int id;
	public int postId;
	public String name;
	public String comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
