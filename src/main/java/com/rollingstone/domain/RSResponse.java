package com.rollingstone.domain;

public class RSResponse<T> {

	private String message;
	private T payload;
	private String errorMEssage;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getPayload() {
		return payload;
	}
	public void setPayload(T payload) {
		this.payload = payload;
	}
	public String getErrorMEssage() {
		return errorMEssage;
	}
	public void setErrorMEssage(String errorMEssage) {
		this.errorMEssage = errorMEssage;
	}
	public RSResponse(String message, T payload, String errorMEssage) {
		super();
		this.message = message;
		this.payload = payload;
		this.errorMEssage = errorMEssage;
	}
	public RSResponse() {
		super();
	}
	@Override
	public String toString() {
		return "RSResponse [message=" + message + ", payload=" + payload + ", errorMEssage=" + errorMEssage + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((errorMEssage == null) ? 0 : errorMEssage.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((payload == null) ? 0 : payload.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RSResponse other = (RSResponse) obj;
		if (errorMEssage == null) {
			if (other.errorMEssage != null)
				return false;
		} else if (!errorMEssage.equals(other.errorMEssage))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (payload == null) {
			if (other.payload != null)
				return false;
		} else if (!payload.equals(other.payload))
			return false;
		return true;
	}
	
	
	
}
