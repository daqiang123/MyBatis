package org.mybatis.example;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户映射器
 * @author 大强
 *
 */
public interface UserMapper {
	
	// HashMap selectUsers(int id);
	
	User selectUsersObject(int id);
	
	User selectUsersConstructor(int id);
	
	void insertUser(User user);
	
	@Select("select * from users where ${column} = #{value}")
	User findByColumn(@Param("column") String column, @Param("value") String value);
	
	User selectUsers(int id);
	
}
