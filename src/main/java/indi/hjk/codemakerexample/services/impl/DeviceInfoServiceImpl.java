package indi.hjk.codemakerexample.services.impl;

import java.util.List;

import indi.hjk.codemakerexample.dao.DeviceInfoMapper;
import indi.hjk.codemakerexample.entity.DeviceInfo;
import indi.hjk.codemakerexample.services.DeviceInfoService;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
  * DeviceInfoController
  * Created by CoderMaker on 2017/01/16.
  */
@Component
@Transactional(readOnly = true)
public class DeviceInfoServiceImpl implements DeviceInfoService {
	private final static Logger log= Logger.getLogger(DeviceInfoService.class);
	
	@Autowired
	DeviceInfoMapper deviceinfoMapper;

	/**
	  * 根据实体类条件查询数据(分页)
	  * Querying data based on entity class conditions.(pagination)
	  * @param deviceinfo
	  * @return Data mapping entity list
	  */
	public List<DeviceInfo> queryDeviceInfoListByCondition(DeviceInfo deviceinfo) {
		RowBounds rb = new RowBounds();
		List<DeviceInfo> deviceinfoList = deviceinfoMapper.queryDeviceInfoListByCondition(deviceinfo, rb);
		return deviceinfoList;
	}

	/**
	  * 根据实体类条件查询数据(无分页)
	  * Querying data based on entity class conditions.(no pagination)
      * @param deviceinfo
	  * @return Data mapping entity list
	  */
	public List<DeviceInfo> queryDeviceInfoListByConditionNoPage(DeviceInfo deviceinfo){
		return deviceinfoMapper.queryDeviceInfoListByConditionNoPage(deviceinfo);
	}

	/**
	  * 根据实体类条件查询数据总条数
      * Querying data count based on entity class conditions.
	  * @param deviceinfo
	  * @return Total Data
	  */
	public Integer queryDeviceInfoNumByCondition(DeviceInfo deviceinfo) {
		Integer count = deviceinfoMapper.queryDeviceInfoNumByCondition(deviceinfo);
        return count;
	}

	/**
	  * 根据实体类属性进行数据添加
	  * Add data based on entity class attributes.
	  * @param deviceinfo
	  */
	public void addDeviceInfo(DeviceInfo deviceinfo) {
		deviceinfoMapper.addDeviceInfo(deviceinfo);
	}

	/**
	  * 根据主键删除数据
	  * Delete data according to the primary key.
	  * @param id  PrimaryKey
	  */
	public void deleteDeviceInfo(String id) {
		// TODO Auto-generated method stub
		deviceinfoMapper.deleteDeviceInfo(id);
	}

	/**
	  * 根据主键获取数据实体
	  * Querying Data entity based on primary key.
	  * @param id  PrimaryKey
	  * @return Data mapping entity
	  */
	public DeviceInfo getDeviceInfo(String id) {
		// TODO Auto-generated method stub
		return deviceinfoMapper.getDeviceInfo(id);
	}

	/**
	  * 根据实体类属性修改数据
	  * Modify data based on entity class attributes.
	  * @param deviceinfo
	  */
	public void editDeviceInfo(DeviceInfo deviceinfo) {
		deviceinfoMapper.editDeviceInfo(deviceinfo);
	}

	/**
	  * 查询所有数据
	  * Querying all data.
	  * @return Data mapping entity list
	  */
	public List<DeviceInfo> queryAllDeviceInfo(){
		return deviceinfoMapper.queryAllDeviceInfo();
	}

}
