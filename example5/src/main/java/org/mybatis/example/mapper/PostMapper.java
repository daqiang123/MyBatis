package org.mybatis.example.mapper;

import java.util.List;

import org.mybatis.example.domain.Post;

/**
 * 文章映射器
 * @author 大强
 *
 */
public interface PostMapper {
	
	List<Post> selectPostIn(List<Integer> list);

}
