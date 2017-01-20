package indi.hjk.codemakerexample.entity;

import java.io.Serializable;

/**
 * DeviceInfo 实体类
 * Created by CoderMaker on 2017/01/16.
 */ 
public class DeviceInfo implements Serializable {
    private Integer id; //  主键ID
    private String dev_id; //  设备ID
    private String dev_nickname; //  设备自定义名称
    private Integer dev_company; //  厂商类型
    private String dev_ip; //  设备IP
    private Integer dev_port; //  设备端口
    private String dev_username; //  设备用户名
    private String dev_password; //  设备密码
    private Integer proxy_port; //  代理端口
    private String proxy_status; //  设备代理状态(类型：1:在线；0：离线)
    private Integer stat; //  记录有效 1：有效；0：无效
    private Integer extend_1; //  扩展参数1
    private String extend_2; //  扩展参数2
    private Integer stream_type; //  码流类型
    private Integer conn_type; //  链接类型
    private Integer frame_height; //  视频帧信息：高
    private Integer frame_width; //  视频帧信息：宽
    private Integer frame_rate; //  视频帧信息：帧率
    private String video_url; //  视频URL
    private java.util.Date update_date; //  更新时间
    private String update_date_start; //  更新时间_开始时间
    private String update_date_end; //  更新时间_结束时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevid() {
        return dev_id;
    }

    public void setDevid(String devid) {
        this.dev_id = devid;
    }

    public String getDevnickname() {
        return dev_nickname;
    }

    public void setDevnickname(String devnickname) {
        this.dev_nickname = devnickname;
    }

    public Integer getDevcompany() {
        return dev_company;
    }

    public void setDevcompany(Integer devcompany) {
        this.dev_company = devcompany;
    }

    public String getDevip() {
        return dev_ip;
    }

    public void setDevip(String devip) {
        this.dev_ip = devip;
    }

    public Integer getDevport() {
        return dev_port;
    }

    public void setDevport(Integer devport) {
        this.dev_port = devport;
    }

    public String getDevusername() {
        return dev_username;
    }

    public void setDevusername(String devusername) {
        this.dev_username = devusername;
    }

    public String getDevpassword() {
        return dev_password;
    }

    public void setDevpassword(String devpassword) {
        this.dev_password = devpassword;
    }

    public Integer getProxyport() {
        return proxy_port;
    }

    public void setProxyport(Integer proxyport) {
        this.proxy_port = proxyport;
    }

    public String getProxystatus() {
        return proxy_status;
    }

    public void setProxystatus(String proxystatus) {
        this.proxy_status = proxystatus;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Integer getExtend1() {
        return extend_1;
    }

    public void setExtend1(Integer extend1) {
        this.extend_1 = extend1;
    }

    public String getExtend2() {
        return extend_2;
    }

    public void setExtend2(String extend2) {
        this.extend_2 = extend2;
    }

    public Integer getStreamtype() {
        return stream_type;
    }

    public void setStreamtype(Integer streamtype) {
        this.stream_type = streamtype;
    }

    public Integer getConntype() {
        return conn_type;
    }

    public void setConntype(Integer conntype) {
        this.conn_type = conntype;
    }

    public Integer getFrameheight() {
        return frame_height;
    }

    public void setFrameheight(Integer frameheight) {
        this.frame_height = frameheight;
    }

    public Integer getFramewidth() {
        return frame_width;
    }

    public void setFramewidth(Integer framewidth) {
        this.frame_width = framewidth;
    }

    public Integer getFramerate() {
        return frame_rate;
    }

    public void setFramerate(Integer framerate) {
        this.frame_rate = framerate;
    }

    public String getVideourl() {
        return video_url;
    }

    public void setVideourl(String videourl) {
        this.video_url = videourl;
    }

    public java.util.Date getUpdatedate() {
        return update_date;
    }

    public void setUpdatedate(java.util.Date updatedate) {
        this.update_date = updatedate;
    }

    public String getUpdatedate_start() {
        return update_date_start;
    }

    public void setUpdatedate_start(String update_date_start) {
        this.update_date_start = update_date_start;
    }

    public String getUpdatedate_end() {
        return update_date_end;
    }

    public void setUpdatedate_end(String update_date_end) {
        this.update_date_end = update_date_end;
    }

}

