package org.mybatis.example.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.mybatis.example.domain.Blog;
import org.mybatis.example.util.MyBatisUtil;

/**
 * Author测试类
 * 
 * @author 大强
 *
 */
public class BlogMapperTest {

	Logger logger = Logger.getLogger(BlogMapperTest.class);

	// 注意：选中方法名，单击鼠标右键，选择 Run as -> JUnit Test，就能执行单个方法。

	/**
	 * 非常复杂的结果映射测试方法
	 */
	@Test
	public void selectBlogDetailsTest() {
		logger.info("非常复杂的结果映射开始...");
		SqlSession session = MyBatisUtil.getSqlSession();
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		List<Blog> list = mapper.selectBlogDetails(101);
		if (list != null) {
			for (Blog blog : list) {
				logger.info(blog.getId());
				logger.info(blog.getTitle());
			}
		}
		MyBatisUtil.closeSqlSession(session);
		logger.info("非常复杂的结果映射结束");
	}

}
