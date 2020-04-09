package org.mybatis.example;

import java.util.HashMap;
import java.util.List;

/**
 * 作者映射器
 * @author 大强
 *
 */
public interface AuthorMapper {
	
	List<HashMap> selectUsers();

	void insertAuthor(Author author);
	
	void updateAuthor(Author author);
	
	void deleteAuthor(int id);
	
}
