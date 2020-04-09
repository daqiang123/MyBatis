package org.mybatis.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.mybatis.example.domain.Author;
import org.mybatis.example.domain.Post;
import org.mybatis.example.mapper.AuthorMapper;
import org.mybatis.example.mapper.PostMapper;

/**
 * 主方法
 * 
 * @author 大强
 *
 */
public class Main {
	
	static Logger logger = Logger.getLogger(Main.class); 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			// 从类路径下加载资源文件mybatis-config.xml
			String resource = "org/mybatis/example/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 由 SqlSessionFactoryBuilder创建SqlSessionFactory
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 由 SqlSessionFactory创建SqlSession
			session = sqlSessionFactory.openSession();

			// 博客
			// BlogMapper mapper = session.getMapper(BlogMapper.class);
			// Blog blog = mapper.selectBlog(101);
			// System.out.println("id=" + blog.getId());
			// System.out.println("title=" + blog.getTitle());
			// System.out.println("content=" + blog.getContent());
			// 人员
			// PersonMapper mapper = session.getMapper(PersonMapper.class);
			// HashMap person = mapper.selectPerson(201);
			// System.out.println("主键=" + person.get("id"));
			// System.out.println("全名=" + person.get("full_name"));

			// 新增作者
			// AuthorMapper mapper = session.getMapper(AuthorMapper.class);
			// Author author = new Author();
			// author.setUsername("克林顿");
			// author.setPassword("12345678");
			// author.setEmail("clinton.begin@gmail.com");
			// author.setBio("MyBatis团队成员");
			// author.setFavouriteSection("打球");
			// mapper.insertAuthor(author);
			// session.commit();
			// 修改作者
			// AuthorMapper mapper = session.getMapper(AuthorMapper.class);
			// Author author = new Author();
			// author.setId(302);
			// author.setUsername("布兰登");
			// author.setPassword("12345678");
			// author.setEmail("brandon.goodin@gmail.com");
			// author.setBio("MyBatis团队成员");
			// author.setFavouriteSection("跑步");
			// mapper.updateAuthor(author);
			// session.commit();
			// 删除作者
			// AuthorMapper mapper = session.getMapper(AuthorMapper.class);
			// mapper.deleteAuthor(303);
			// session.commit();
			// SQL代码
			// AuthorMapper mapper = session.getMapper(AuthorMapper.class);
			// List<HashMap> list = mapper.selectUsers();
			// for (HashMap hashMap : list) {
			// System.out.println("主键：" + hashMap.get("id"));
			// System.out.println("用户名：" + hashMap.get("username"));
			// System.out.println("密码：" + hashMap.get("password"));
			// System.out.println("");
			// }

			// 参数
			// 简单参数
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// User user = mapper.selectUsers(403);
			// System.out.println("主键：" + user.getId());
			// System.out.println("用户名：" + user.getUsername());
			// System.out.println("邮箱：" + user.getEmail());
			// 对象参数
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// User user = new User();
			// user.setUsername("test2");
			// user.setPassword("123456");
			// user.setEmail("test2@gmail.com");
			// mapper.insertUser(user);
			// session.commit();

			// 字符串替换
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// User user = mapper.findByColumn("id", "403");
			// User user = mapper.findByColumn("username", "guest");
			// User user = mapper.findByColumn("email", "guest@gmail.com");
			// if (user != null) {
			// System.out.println("主键：" + user.getId());
			// System.out.println("用户名：" + user.getUsername());
			// }

			// 结构映射
			// HashMap
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// HashMap hashMap = mapper.selectUsers(402);
			// System.out.println("主键：" + hashMap.get("id"));
			// System.out.println("用户名：" + hashMap.get("username"));
			// Object
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// User user = mapper.selectUsersObject(402);
			// System.out.println("主键：" + user.getId());
			// System.out.println("用户名：" + user.getUsername());
			// System.out.println("密码：" + user.getPassword());
			// 构造函数
			// UserMapper mapper = session.getMapper(UserMapper.class);
			// User user = mapper.selectUsersConstructor(402);
			// if (user != null) {
			// System.out.println("主键：" + user.getId());
			// System.out.println("用户名：" + user.getUsername());
			// System.out.println("密码：" + user.getPassword());
			// }

			// 关联的嵌套 Select 查询
			// 关联的嵌套结果映射
			// BlogMapper mapper = session.getMapper(BlogMapper.class);
			// Blog blog = mapper.selectBlog(101);
			// 关联的多结果集（ResultSet）
			// Map<String, Object> map = new HashMap<String, Object>();
			// map.put("blogId", 101);
			// map.put("authorId", 301);
			// Blog blog = mapper.selectBlog(map);
			// if (blog != null) {
			// System.out.println("主键：" + blog.getId());
			// System.out.println("标题：" + blog.getTitle());
			// if (blog.author != null) {
			// System.out.println("作者主键：" + blog.author.getId());
			// System.out.println("作者用户名：" + blog.author.getUsername());
			// }
			// }

			// 集合的嵌套 Select 查询
			// 集合的嵌套结果映射
			// 集合的多结果集（ResultSet）
//		BlogMapper mapper = session.getMapper(BlogMapper.class);
//		Blog blog = mapper.selectBlog(101);
//		if (blog != null) {
//			System.out.println("主键：" + blog.getId());
//			System.out.println("标题：" + blog.getTitle());
//			if (blog.posts != null) {
//				for (Post post : blog.posts) {
//					System.out.println("文章主键：" + post.getId());
//					System.out.println("文章主题：" + post.getSubject());
//				}
//			}
//		}
			// 鉴别器
//		VehicleMapper mapper = session.getMapper(VehicleMapper.class);
//		Vehicle vehicle = mapper.selectVehicle(902);
//		if (vehicle != null) {
//			System.out.println("主键：" + vehicle.getId());
//			System.out.println("名称：" + vehicle.getVin());
//		}
//		if (vehicle instanceof Car) { // 汽车
//			Car car = (Car) vehicle;
//			System.out.println("门数：" + car.getDoorCount());
//		} else if (vehicle instanceof Truck) { // 卡车
//			Truck truck = (Truck) vehicle;
//			System.out.println("箱数：" + truck.getBoxSize());
//		}

			// 自动映射
//		UserMapper mapper = session.getMapper(UserMapper.class);
//		User user = mapper.selectUsers(402);
//		if (user != null) {
//			System.out.println("主键：" + user.getId());
//			System.out.println("用户名：" + user.getUsername());
//			System.out.println("密码：" + user.getPassword());
//		}

//		BlogMapper mapper = session.getMapper(BlogMapper.class);
//		Blog blog = mapper.selectBlog(101);
//		if (blog != null) {
//			System.out.println("主键：" + blog.getId());
//			System.out.println("标题：" + blog.getTitle());
//			if (blog.author != null) {
//				System.out.println("作者主键：" + blog.author.getAuthorid());
//				System.out.println("作者用户名：" + blog.author.getUsername());
//			}
//		}

			// 缓存
//		UserMapper mapper = session.getMapper(UserMapper.class);
			// 第一次查询
//		User user1 = mapper.selectUsers(402);
//		if (user1 != null) {
//			System.out.println("第一次查询主键：" + user1.getId());
//			System.out.println("第一次查询用户名：" + user1.getUsername());
//			System.out.println("第一次查询密码：" + user1.getPassword());
//		}
			// 第二次查询
//		User user2 = mapper.selectUsers(402);
//		if (user2 != null) {
//			System.out.println("第二次查询主键：" + user2.getId());
//			System.out.println("第二次查询用户名：" + user2.getUsername());
//			System.out.println("第二次查询密码：" + user2.getPassword());
//		}

			// 动态SQL
			// if
			// choose、when、otherwise
			// trim、where、set
			// BlogMapper mapper = session.getMapper(BlogMapper.class);
			// Blog blog = new Blog();
			// blog.setTitle("%3.5.1%");
			// List<Blog> list = mapper.findActiveBlogWithTitleLike(blog);
			// blog.setTitle("%3.5.1%");
			// Author author = new Author();
			// author.setUsername("%布兰登%");
//		blog.setState("ACTIVE");
//		blog.setTitle("%3.5.1%");
			// author.setUsername("%克林顿%");
//		blog.setAuthor(author);
//		List<Blog> list = mapper.findActiveBlogLike(blog);
//		if (list != null) {
//			for(Blog b : list) {
//				System.out.println("主键：" + b.getId());
//				System.out.println("标题：" + b.getTitle());
//				System.out.println("");
//			}
//		}
//		AuthorMapper mapper = session.getMapper(AuthorMapper.class);
//		Author author = new Author();
//		author.setAuthorid(301);
//		author.setUsername("克林顿");
//		author.setPassword("12345678");
//		author.setEmail("clinton.begin@gmail.com");
//		author.setBio("MyBatis团队成员");
//		mapper.updateAuthorIfNecessary(author);
//		session.commit();
			// foreach
//			PostMapper mapper = session.getMapper(PostMapper.class);
//			List<Integer> in = new ArrayList<Integer>();
//			in.add(501);
//			in.add(502);
//			in.add(503);
//			List<Post> list = mapper.selectPostIn(in);
//			if (list != null) {
//				for (Post post : list) {
//					System.out.println("主键：" + post.getId());
//					System.out.println("主题：" + post.getSubject());
//				}
//			}
//			// session.commit();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//			session.rollback(true);
//		} finally {
//			session.close();
//		}
			// 使用映射器
			// 新增作者
			logger.info("新增作者开始...");
			AuthorMapper mapper = session.getMapper(AuthorMapper.class);
			Author insertAuthor = new Author();
			insertAuthor.setId(304);
			insertAuthor.setUsername("克林顿insert");
			insertAuthor.setPassword("12345678");
			insertAuthor.setEmail("clinton.begin@gmail.com");
			insertAuthor.setBio("MyBatis团队成员");
			insertAuthor.setFavouriteSection("打球");
			// mapper.insertAuthor(insertAuthor);
			mapper.insertAuthorAnnotation(insertAuthor);
			session.commit();
			logger.info("新增作者结束");
			// 修改作者
			logger.info("修改作者开始...");
			Author updateAuthor = new Author();
			updateAuthor.setId(304);
			updateAuthor.setUsername("布兰登update");
			updateAuthor.setPassword("12345678");
			updateAuthor.setEmail("brandon.goodin@gmail.com");
			updateAuthor.setBio("MyBatis团队成员");
			updateAuthor.setFavouriteSection("跑步");
			// mapper.updateAuthor(updateAuthor);
			mapper.updateAuthorAnnotation(updateAuthor);
			session.commit();
			logger.info("修改作者结束");
			// 删除作者
			// mapper.deleteAuthor(304);
			mapper.deleteAuthorAnnotation(304);
			session.commit();
			
			// SQL 语句构建器
			String sql = selectPersonSql();
			System.out.println("sql:" + sql);
		} catch (IOException e) {
			e.printStackTrace();
			session.rollback(true);
		} finally {
			session.close();
		}

	}

	private static String selectPersonSql() {
		return new SQL() {
			{
				SELECT("P.ID, P.USERNAME, P.PASSWORD, P.FULL_NAME");
				SELECT("P.LAST_NAME, P.CREATED_ON, P.UPDATED_ON");
				FROM("PERSON P");
				FROM("ACCOUNT A");
				INNER_JOIN("DEPARTMENT D on D.ID = P.DEPARTMENT_ID");
				INNER_JOIN("COMPANY C on D.COMPANY_ID = C.ID");
				WHERE("P.ID = A.ID");
				WHERE("P.FIRST_NAME like ?");
				OR();
				WHERE("P.LAST_NAME like ?");
				GROUP_BY("P.ID");
				HAVING("P.LAST_NAME like ?");
				OR();
				HAVING("P.FIRST_NAME like ?");
				ORDER_BY("P.ID");
				ORDER_BY("P.FULL_NAME");
			}
		}.toString();
	}

}
