package org.mybatis.example;

import java.util.HashMap;
import java.util.Map;

/**
 * 博客映射器
 * @author 大强
 *
 */
public interface BlogMapper {

	// Blog selectBlog(int id);
	
	// Blog selectBlog(Map<String, Object> map);
	
	Blog selectBlog(int id);

}
