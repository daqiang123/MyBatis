package org.mybatis.example.domain;

/**
 * 草稿文章POJO类
 * 
 * @author 大强
 *
 */
public class DraftPost extends Post {

	public String draftBody;

	public String getDraftBody() {
		return draftBody;
	}

	public void setDraftBody(String draftBody) {
		this.draftBody = draftBody;
	}

}
