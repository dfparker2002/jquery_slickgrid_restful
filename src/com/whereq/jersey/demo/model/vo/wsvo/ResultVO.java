package com.whereq.jersey.demo.model.vo.wsvo;

import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "Result")
public class ResultVO implements Identifiable{
	
	private String key;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
