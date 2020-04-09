package org.mybatis.example.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.mybatis.example.domain.Author;

/**
 * 作者映射器
 * 
 * @author 大强
 *
 */
public interface AuthorMapper {

//	List<HashMap> selectUsers();
//
//	void insertAuthor(Author author);
//	
//	void updateAuthor(Author author);
//	
//	void deleteAuthor(int id);
//	
//	void updateAuthorIfNecessary(Author author);

	Author selectAuthor(int id);

	List<Author> selectAuthors();

	int insertAuthor(Author author);

	int updateAuthor(Author author);

	int deleteAuthor(int id);

	@Insert("insert into Author " + " (id,username,password,email,bio,favourite_section) "
			+ " values (#{id},#{username},#{password},#{email},#{bio},#{favouriteSection})")
	int insertAuthorAnnotation(Author author);

	@Update("update author set username = #{username}, password = #{password},"
			+ " email = #{email}, bio = #{bio}, favourite_section = #{favouriteSection}" + " where id = #{id}")
	int updateAuthorAnnotation(Author author);

	@Delete("delete from author where id = #{id}")
	public void deleteAuthorAnnotation(@Param("id") int id);

}
