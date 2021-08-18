package com.ashifshadab.commons.exception.server;

import com.ashifshadab.commons.exception.BaseException;

public class ServiceException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ServiceException(String errorCode, String errorMessage, Throwable cause) {
		super(errorCode, errorMessage, cause);
	}

}
