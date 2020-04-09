package org.mybatis.example.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.example.domain.Blog;

/**
 * 博客映射器
 * @author 大强
 *
 */
public interface BlogMapper {

	// Blog selectBlog(int id);
	
	// Blog selectBlog(Map<String, Object> map);
	
	int inserBlog(Blog blog);
	
	Blog selectBlog(int id);
	
	List<Blog> findActiveBlogWithTitleLike(Blog blog);
	
	List<Blog> findActiveBlogLike(Blog blog);
	
}
