package org.mybatis.example;

import java.util.HashMap;

/**
 * 人员映射器
 * @author 大强
 *
 */
public interface PersonMapper {

	HashMap selectPerson(int id);

}
