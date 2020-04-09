package org.mybatis.example;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 主方法
 * @author 大强
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 从 XML 中构建 SqlSessionFactory
		String resource = "org/mybatis/example/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 从 SqlSessionFactory 中获取 SqlSession
		SqlSession session = sqlSessionFactory.openSession();
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		Blog blog = mapper.selectBlog(101);
		System.out.println("id=" + blog.getId());
		System.out.println("title=" + blog.getTitle());
		System.out.println("content=" + blog.getContent());
	}

}
