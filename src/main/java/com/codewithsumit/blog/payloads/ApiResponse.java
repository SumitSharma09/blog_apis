package com.codewithsumit.blog.payloads;

import java.util.Objects;

public class ApiResponse {
	
	private String message;
	private boolean success;
	
	public ApiResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	@Override
	public int hashCode() {
		return Objects.hash(message, success);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApiResponse other = (ApiResponse) obj;
		return Objects.equals(message, other.message) && success == other.success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	

}
