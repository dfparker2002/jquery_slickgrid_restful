package com.whereq.jersey.demo.model.vo.wsvo;

import java.util.ArrayList;

/**
 * ArrayList extension class to provide list as a response for a web service
 * request. Its needed to fix the problem of Generic, in de-serialization. 
 * 
 *  
 * @param <T>
 */

public class ResponseResultVOList<T extends Identifiable> extends ArrayList<T> implements Identifiable{

	private static final long serialVersionUID = -7742286701564193999L;

	public Long getId() {
		return null;
	}
}
