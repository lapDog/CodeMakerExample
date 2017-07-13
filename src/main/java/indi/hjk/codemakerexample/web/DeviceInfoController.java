package indi.hjk.codemakerexample.web;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import indi.hjk.codemakerexample.entity.DeviceInfo;
import indi.hjk.codemakerexample.entity.common.Result;
import indi.hjk.codemakerexample.entity.common.PageBean;
import indi.hjk.codemakerexample.services.DeviceInfoService;
import indi.hjk.codemakerexample.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
  * DeviceInfo Controller
  * Created by CoderMaker on 2017/01/16.
  */
@Controller
@RequestMapping("/deviceinfo")
public class DeviceInfoController extends BaseController{
	
	private final static Logger logger= LoggerFactory.getLogger(DeviceInfoController.class);
	
	@Autowired
	private DeviceInfoService deviceinfoService;
	
	/**
	 * 跳转至查询页面
     * Jump to query page
	 * @param deviceinfo 实体类
	 * @param flag
     * @param pageIndex 分页当前页，默认1
     * @param pageSize 分页每页数量，默认10
     * @param total 分页总数，默认0
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/list", method={RequestMethod.GET, RequestMethod.POST})
	public String  list(HttpServletRequest request,DeviceInfo deviceinfo,
			@RequestParam (required=false)String flag,
			@RequestParam(value = "page", defaultValue = "1") Integer pageIndex,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize,
			@RequestParam(value = "total", defaultValue = "0") Integer total,
			@RequestParam (required=false)String id, Model model) throws Exception{

		return "deviceinfo/list";
	}

	/**
      * 分页查询数据
	  * Query Data by pagination
	  * @param deviceinfo 实体类
	  * @param flag
	  * @param pageIndex 分页当前页，默认1
	  * @param pageSize 分页每页数量，默认10
	  * @param total 分页总数，默认0
	  * @return
	  * @throws Exception
	  */
	@RequestMapping(value="/loadList", method={RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
	public String loadList(HttpServletRequest request,DeviceInfo deviceinfo,
			@RequestParam (required=false)String flag,
			@RequestParam(value = "page", defaultValue = "1") Integer pageIndex,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize,
			@RequestParam(value = "total", defaultValue = "0") Integer total,
			@RequestParam (required=false)String id, Model model) throws Exception{

		logger.info("查询DeviceInfo列表开始");
		if(null==total||total.intValue()<=0){
			total= Integer.parseInt(deviceinfoService.queryDeviceInfoNumByCondition(deviceinfo).toString());
		}
		//设置分页对象
		PageBean<DeviceInfo> page = new PageBean<DeviceInfo>();
		page.setTotal(total);
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		Integer totalPage = 0;
	     if (total % pageSize == 0)
	       totalPage = total / pageSize;
	     else {
	       totalPage = total / pageSize + 1;
	     }
		page.setTotalPage(totalPage);
		//压入查询参数:开始位置与查询多少条数
		deviceinfo.setStartIndex(((pageIndex == 0 ? 1 : pageIndex) - 1) * pageSize * 1l);
		deviceinfo.setEndIndex((pageIndex) * pageSize * 1l);
		
		//查询集合		
		List<DeviceInfo> deviceinfoList = deviceinfoService.queryDeviceInfoListByCondition(deviceinfo);
		page.setRows(deviceinfoList);
		logger.info("查询DeviceInfo列表结束");
		return JsonUtil.toJSONString(page);
	}
	
	/**
      * 跳转添加页面
      * jump to add page
      */
	@RequestMapping("/add")
	public String add(HttpServletRequest request,@RequestParam (required=false)String flag,Model model) {
		model.addAttribute("flag", flag);
		return "deviceinfo/add";
	}

	/**
      * 执行添加操作
      * do add operation
 	  */
	@RequestMapping(value = "/doAdd", method = RequestMethod.POST)
	@ResponseBody
	public String doAdd(HttpServletRequest request,DeviceInfo deviceinfo) {
		try {
			logger.info("DeviceInfo添加处理开始");
			deviceinfoService.addDeviceInfo(deviceinfo);
			logger.info("DeviceInfo添加处理结束");
		} catch (Exception e) {
			e.printStackTrace();
			return JsonUtil.toJSONString(new Result(false,"新增失败"));
		}
		return JsonUtil.toJSONString(new Result(true,"新增成功"));
	}

	/**
	  * 跳转至编辑页面
	  * jump to edit page
	  */
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public String edit(@PathVariable String id,@RequestParam (required=false)String flag, Map<String, Object> map) {
		DeviceInfo deviceinfo = deviceinfoService.getDeviceInfo(id);
		map.put("deviceinfo", deviceinfo);
		map.put("flag", flag);
		return "deviceinfo/edit";
	}

	/**
	  * 执行编辑操作
	  * do edit operation
	  */
	@RequestMapping(value="/doEdit", method=RequestMethod.POST)
	@ResponseBody
	public String doEdit(HttpServletRequest request,DeviceInfo deviceinfo) {
		try{
			logger.info("DeviceInfo修改处理开始");
			deviceinfoService.editDeviceInfo(deviceinfo);
			logger.info("DeviceInfo修改处理结束");
		}catch (Exception e) {
			e.printStackTrace();
			return JsonUtil.toJSONString(new Result(false,"编辑失败"));
		}
		return JsonUtil.toJSONString(new Result(true,"编辑成功"));
	}

	/**
	  * 跳转至详情页面
	  * jump to detail page
	  */
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public String view(HttpServletRequest request,@PathVariable String id, Map<String, Object> map) {
		DeviceInfo deviceinfo = deviceinfoService.getDeviceInfo(id);
		map.put("deviceinfo", deviceinfo);
		return "deviceinfo/view";
	}
	
	/**
	 * 执行删除操作
     * do delete operation
	 */
	@RequestMapping(value="/delete/{id}", method={RequestMethod.GET, RequestMethod.POST})
	@ResponseBody
	public String delete(HttpServletRequest request,@PathVariable String id) {
		try{
			logger.info("DeviceInfo删除处理开始");
			deviceinfoService.deleteDeviceInfo(id);
			logger.info("DeviceInfo删除处理结束");
		} catch (Exception e) {
			e.printStackTrace();
			return JsonUtil.toJSONString(new Result(false,"删除失败"));
		}
		return JsonUtil.toJSONString(new Result(true,"删除成功"));
	}
	
}
