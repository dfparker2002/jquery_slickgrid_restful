package com.whereq.jersey.demo.utils;

import com.whereq.jersey.demo.model.vo.wsvo.ResponseVO;

public class WebserviceUtils {
	
	private static final int FAILURE_CODE = 500;
	private static final int SUCCESS_CODE = 200;
	private static final int ROW_COUNT_EXCEED = 520;
	
	
	public static void markSuccess(ResponseVO responseVO){
		responseVO.setMsg("SUCCESS");
		responseVO.setStatus(SUCCESS_CODE);
	}
	
	public static void markSuccess(ResponseVO responseVO, String msg){
		responseVO.setMsg(msg);
		responseVO.setStatus(SUCCESS_CODE);
	}
	
	public static void markFailure(ResponseVO responseVO, Exception e){
		responseVO.setStatus(FAILURE_CODE);
		responseVO.setMsg(e.getMessage());
	}
	
	public static void markFailure(ResponseVO responseVO, String msg){
		responseVO.setStatus(FAILURE_CODE);
		responseVO.setMsg(msg);
	}
	
	public static void markRowCountExceed(ResponseVO responseVO, String msg){
		responseVO.setStatus(ROW_COUNT_EXCEED);
		responseVO.setMsg(msg);
	}

}
