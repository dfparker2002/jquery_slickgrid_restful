package com.whereq.jersey.demo.model.vo.wsvo;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "location")
public class LocationVO implements Identifiable {

	Long id;
	String name;
	String address;
	String description;
	String updateable;
	
	public LocationVO() {
	}

	@JsonCreator
	public LocationVO(String input) {
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpdateable() {
		return updateable;
	}

	public void setUpdateable(String updateable) {
		this.updateable = updateable;
	}
}
