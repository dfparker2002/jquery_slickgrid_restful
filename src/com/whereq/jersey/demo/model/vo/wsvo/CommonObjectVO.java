package com.whereq.jersey.demo.model.vo.wsvo;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value = "commonObject")
public class CommonObjectVO implements Identifiable {

	private Long id;
	private String name;
	private String displayName;
	public CommonObjectVO() {
	}

	@JsonCreator
	public CommonObjectVO(String input) {
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

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public boolean equals(Object obj) {
		CommonObjectVO fieldVO = (CommonObjectVO)obj;
		String name = fieldVO.getName();
		
		if(name.equals(this.getName())){
			return true;
		}else{
			return false;
		}
	}
}
