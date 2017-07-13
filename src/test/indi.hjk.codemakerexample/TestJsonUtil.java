package indi.hjk.codemakerexample;

import indi.hjk.codemakerexample.entity.DeviceInfo;
import indi.hjk.codemakerexample.utils.JsonUtil;

import java.util.Date;

/**
 * Created by HJK on 2017/1/20.
 */
public class TestJsonUtil {

    public static void main(String [] args){
        DeviceInfo di=new DeviceInfo();
        di.setDevid("d");
        di.setUpdatedate(new Date());
        di.setId(22);

        System.out.println(JsonUtil.toJSONString(di));

    }
}
