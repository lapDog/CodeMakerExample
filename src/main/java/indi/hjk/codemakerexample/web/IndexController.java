package indi.hjk.codemakerexample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by HJK on 2017/1/19.
 */
@Controller
public class IndexController extends BaseController{

    @RequestMapping("/")
    public String index(HttpServletRequest request){
        return "index";
    }

}
