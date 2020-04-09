package org.mybatis.example.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.mybatis.example.domain.Author;
import org.mybatis.example.util.MyBatisUtil;

/**
 * Author测试类
 * 
 * @author 大强
 *
 */
public class AuthorMapperTest {

	Logger logger = Logger.getLogger(AuthorMapperTest.class);

	// 注意：选中方法名，单击鼠标右键，选择 Run as -> JUnit Test，就能执行单个方法。

	/**
	 * 查询Author测试方法
	 */
	@Test
	public void selectAuthorTest() {
		logger.info("查询作者开始...");
		SqlSession session = MyBatisUtil.getSqlSession();
		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
		Author author = mapper.selectAuthor(301);
		if (author != null) {
			logger.info(author.getId());
			logger.info(author.getUsername());
		}
		MyBatisUtil.closeSqlSession(session);
	}

	/**
	 * 新增Author测试方法
	 */
	@Test
	public void insertAuthorTest() {
		SqlSession session = MyBatisUtil.getSqlSession();
		logger.info("新增作者开始...");
		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
		Author insertAuthor = new Author();
		insertAuthor.setId(304);
		insertAuthor.setUsername("克林顿insert");
		insertAuthor.setPassword("12345678");
		insertAuthor.setEmail("clinton.begin@gmail.com");
		insertAuthor.setBio("MyBatis团队成员");
		insertAuthor.setFavouriteSection("打球");
		mapper.insertAuthor(insertAuthor);
		session.commit();
		MyBatisUtil.closeSqlSession(session);
	}

	/**
	 * 修改Author测试方法
	 */
	@Test
	public void updateAuthorTest() {
		SqlSession session = MyBatisUtil.getSqlSession();
		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
		logger.info("修改作者开始...");
		Author updateAuthor = new Author();
		updateAuthor.setId(304);
		updateAuthor.setUsername("布兰登update");
		updateAuthor.setPassword("12345678");
		updateAuthor.setEmail("brandon.goodin@gmail.com");
		updateAuthor.setBio("MyBatis团队成员");
		updateAuthor.setFavouriteSection("跑步");
		mapper.updateAuthor(updateAuthor);
		session.commit();
		MyBatisUtil.closeSqlSession(session);
		logger.info("修改作者结束");
	}

	/**
	 * 删除Author测试方法
	 */
	@Test
	public void deleteAuthorTest() {
		SqlSession session = MyBatisUtil.getSqlSession();
		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
		mapper.deleteAuthor(304);
		session.commit();
	}
}
