package indi.hjk.codemakerexample.entity.common;

import java.io.Serializable;

/**
 * 用于返回JSON结果的封装
 * Created by CoderMaker on 2017/01/16.
 */
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;

	/*是否成功标记*/
	private boolean success=true;
	
	/*返回结果的信息*/
	private String message;
	
	/*返回结果的数据*/
	private Object data;

	/*无参构造*/
	public Result() {

	}

	/*直接传入数据，返回Result
	 * success=ture;
	 * message=null;
	 * */
	public Result(Object data) {
		this.data = data;
	}


	public Result(Boolean success,String message){
		this.success=success;
		this.message=message;
	}

	/*传入成功标记和消息以及数据*/
	public Result(Boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}


	/*setter and getter*/
	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
