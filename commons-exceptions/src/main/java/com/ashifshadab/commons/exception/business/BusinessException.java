package com.ashifshadab.commons.exception.business;

import com.ashifshadab.commons.exception.BaseException;

public class BusinessException extends BaseException {

	private static final long serialVersionUID = 1L;

	public BusinessException(String errorCode, String errorMessage, Throwable cause) {
		super(errorCode, errorMessage, cause);
	}

}
