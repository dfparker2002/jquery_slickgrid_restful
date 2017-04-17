package com.whereq.restful.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.whereq.jersey.demo.model.vo.wsvo.CommonObjectVO;
import com.whereq.jersey.demo.model.vo.wsvo.ConfigurationParameterVO;
import com.whereq.jersey.demo.model.vo.wsvo.Identifiable;
import com.whereq.jersey.demo.model.vo.wsvo.LocationVO;
import com.whereq.jersey.demo.model.vo.wsvo.ResponseResultVOList;
import com.whereq.jersey.demo.model.vo.wsvo.ResponseVO;
import com.whereq.jersey.demo.utils.WebserviceUtils;

/**
 * TODO javadoc.
 *
 * 
 */
@Path("/")
public class ArrayResource {

    @GET
    @Path("array/{size}")
    @Produces({MediaType.APPLICATION_JSON})
    public ResponseVO<Identifiable> getIt(@PathParam("size") long size) {
    	List<Identifiable> list = new ArrayList<Identifiable>();
    	for (int i = 0; i < size; i++) {
    		CommonObjectVO cv = new CommonObjectVO();
    		cv.setId(Long.valueOf(i));
    		cv.setName("name=" + i);
    		cv.setDisplayName("displayName=" + i * 10);
    		list.add(cv);
    	}
    	
    	ResponseVO<Identifiable> response = new ResponseVO<Identifiable>();
    	ResponseResultVOList<Identifiable> responseList = new ResponseResultVOList<Identifiable>();
		responseList.addAll(list);
		response.setResult(responseList);
		WebserviceUtils.markSuccess(response);
		return response;        
    }
    
    @PUT
    @Path("updateConfigurationParameters")
	@Produces( { MediaType.APPLICATION_JSON })
	@Consumes( { MediaType.APPLICATION_JSON })
	public ResponseVO<Identifiable> updateConfigurationParameter(List<ConfigurationParameterVO> configurationParameterVOList) {
		System.out.println(configurationParameterVOList);
		List<Identifiable> list = new ArrayList<Identifiable>();
		list.addAll(configurationParameterVOList);
		ResponseVO<Identifiable> response = new ResponseVO<Identifiable>();
    	ResponseResultVOList<Identifiable> responseList = new ResponseResultVOList<Identifiable>();
		responseList.addAll(list);
		response.setResult(responseList);
		WebserviceUtils.markSuccess(response);
		return response;
	}
    
    @PUT
    @Path("updateLocations")
	@Produces( { MediaType.APPLICATION_JSON })
	@Consumes( { MediaType.APPLICATION_JSON })
	public ResponseVO<Identifiable> updateLocations(List<LocationVO> locationVOList) {
		System.out.println(locationVOList);
		List<Identifiable> list = new ArrayList<Identifiable>();
		list.addAll(locationVOList);
		ResponseVO<Identifiable> response = new ResponseVO<Identifiable>();
    	ResponseResultVOList<Identifiable> responseList = new ResponseResultVOList<Identifiable>();
		responseList.addAll(list);
		response.setResult(responseList);
		WebserviceUtils.markSuccess(response);
		return response;
	}
}
