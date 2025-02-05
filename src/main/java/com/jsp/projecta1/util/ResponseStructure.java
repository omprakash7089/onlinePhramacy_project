package com.jsp.projecta1.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {

	private String message;
	private int httpStatus;
	private Object data;
}