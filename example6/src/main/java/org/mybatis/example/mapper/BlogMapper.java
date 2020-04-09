package org.mybatis.example.mapper;

import java.util.List;

import org.mybatis.example.domain.Blog;

/**
 * 博客映射器
 * 
 * @author 大强
 *
 */
public interface BlogMapper {

	List<Blog> selectBlogDetails(int id);

}
