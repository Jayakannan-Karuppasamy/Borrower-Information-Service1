package com.scb.borrower.information.util;


public class RecordNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(String errorMessage, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(errorMessage, cause, enableSuppression, writableStackTrace);
	}

	public RecordNotFoundException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}

	public RecordNotFoundException(String errorMessage) {
		super(errorMessage);
	}

	public RecordNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
