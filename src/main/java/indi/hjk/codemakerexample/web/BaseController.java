package indi.hjk.codemakerexample.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import indi.hjk.codemakerexample.spring.DateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * All Controller extands BaseController
 * Created by HJK on 2017/1/20.
 */
public class BaseController {
	private static final long serialVersionUID = 6718838822334455667L;

	// 获得客户端真实IP地址
	public String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		/*SimpleDateFormat dateFormat = new SimpleDateForma	t("yyyy-MM-dd HH:mm:ss");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));*/ // true:允许输入空值，false:不能为空值
		binder.registerCustomEditor(Date.class, new DateEditor());
	}



}
