package com.hot.dao.cluster;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.hot.domain.City;

/**
 * 城市 DAO 接口
 * 
 * @author houjianpo
 *
 */
@Mapper
public interface CityDao {
	
	/**
	 * 根据城市名称，查询城市信息
	 *
	 * @param cityName
	 *            城市名
	 */
	public City findByCityName(@Param("cityName") String cityName);
}
