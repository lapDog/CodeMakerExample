package indi.hjk.codemakerexample.services;
import indi.hjk.codemakerexample.entity.DeviceInfo;

import java.util.List;


/**
 * DeviceInfoController Service Interface
 * Created by CoderMaker on 2017/01/16.
 */
public interface DeviceInfoService {

	/**
	  * 根据实体类条件查询数据(分页)
	  * Querying data based on entity class conditions.(pagination)
	  * @param deviceinfo
	  * @return Data mapping entity list
	  */
	List<DeviceInfo> queryDeviceInfoListByCondition(DeviceInfo deviceinfo);

	/**
	  * 根据实体类条件查询数据(无分页)
	  * Querying data based on entity class conditions.(no pagination)
	  * @param deviceinfo
	  * @return Data mapping entity list
	  */
	List<DeviceInfo> queryDeviceInfoListByConditionNoPage(DeviceInfo deviceinfo);

	/**
	  * 根据实体类条件查询数据总条数
	  * Querying data count based on entity class conditions.
	  * @param deviceinfo
	  * @return Total Data
	  */
	Integer queryDeviceInfoNumByCondition(DeviceInfo deviceinfo);

	/**
      * 根据实体类属性进行数据添加
	  * Add data based on entity class attributes.
	  * @param deviceinfo
	  */
	public void addDeviceInfo(DeviceInfo deviceinfo);

	/**
	  * 根据主键删除数据
	  * Delete data according to the primary key.
	  * @param id  PrimaryKey
	  */
	public void deleteDeviceInfo(String id);

	/**
	  * 根据主键获取数据实体
	  * Querying Data entity based on primary key.
	  * @param id  PrimaryKey
	  * @return Data mapping entity
	  */
	public DeviceInfo getDeviceInfo(String id);

	/**
	  * 根据实体类属性修改数据
	  * Modify data based on entity class attributes.
	  * @param deviceinfo
	  */
	public void editDeviceInfo(DeviceInfo deviceinfo);

	/**
	  * 查询所有数据
	  * Querying all data.
	  * @return Data mapping entity list
	  */
	List<DeviceInfo> queryAllDeviceInfo();
}
