package org.mybatis.example;

import java.util.List;

/**
 * 文章映射器
 * @author 大强
 *
 */
public interface PostMapper {
	
	List<Post> selectPostIn(List<Integer> list);

}
