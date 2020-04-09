package org.mybatis.example.domain;

/**
 * 汽车POJO类
 * @author 大强
 *
 */
public class Car extends Vehicle {

	// Car
	public String doorCount;

	public String getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(String doorCount) {
		this.doorCount = doorCount;
	}
	
}
