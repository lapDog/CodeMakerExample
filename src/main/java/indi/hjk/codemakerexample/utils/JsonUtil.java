package indi.hjk.codemakerexample.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * JSON转化工具类(使用fastjson实现)
 * Created by HJK on 2017/1/20.
 */
public class JsonUtil{

	/**
	 * 将对象转为JSON字符串，时间将转为yyyy-MM-dd HH:mm:ss.SSS格式
	 * @param obj 需转化对象
	 * @return
	 */
	public static String toJSONString(Object obj){
		JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
		return JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
	}

	/**
	 * 将对象转为JSON字符串，自定义时间格式
	 * @param obj 需转化对象
	 * @param timePattern 时间字符串格式，可转化为以下格式:
	 *      ISO-8601日期格式
	 *		yyyy-MM-dd
	 *		yyyy-MM-dd HH:mm:ss
	 * 		yyyy-MM-dd HH:mm:ss.SSS
	 *		毫秒数字
	 *		毫秒数字字符串
	 *		.NET JSON日期格式
	 *		new Date(198293238)
	 * @return
	 */
	public static String toJSONString(Object obj,String timePattern){
		JSON.DEFFAULT_DATE_FORMAT = timePattern;
		return JSON.toJSONString(obj, SerializerFeature.WriteDateUseDateFormat);
	}

	/**
	 * 反序列化JSON字符串直接调用fastjson
	 * 对象反序列化: VO vo = JSON.parseObject("...", VO.class);
	 * 范型反序列化: List<VO> list = JSON.parseObject("...", new TypeReference<List<VO>>() {});
	 */

}
