package com.srivignesh.springexpensetracker.jwt;

public class SuccessMessageResponse {
	
	private String messsage;
	private boolean success;
	
	public SuccessMessageResponse() {
		super();
	}
	
	public SuccessMessageResponse(String messsage, boolean success) {
		super();
		this.messsage = messsage;
		this.success = success;
	}
	
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	
}
