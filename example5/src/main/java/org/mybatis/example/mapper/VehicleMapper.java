package org.mybatis.example.mapper;

import org.mybatis.example.domain.Vehicle;

/**
 * 车辆映射器
 * @author 大强
 *
 */
public interface VehicleMapper {

	Vehicle selectVehicle(int id);

}
