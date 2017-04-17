package com.whereq.jersey.demo.model.vo.wsvo;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "response")
public class ResponseVO<T extends Identifiable> {
	private Integer status;
	private String msg;
	private T result;

	public ResponseVO() {
	}
	
	@JsonCreator
	public ResponseVO(String input) {
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
