package com.prosoft.group.core;


import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yammer.dropwizard.json.JsonSnakeCase;

@JsonSnakeCase
public class Saying {
	@JsonProperty
	private long number1;
	@JsonProperty
	private long number2;
	
	@NotNull
	private long result;

	public long getNumber1() {
		return number1;
	}

	public void setNumber1(long number1) {
		this.number1 = number1;
	}

	public long getNumber2() {
		return number2;
	}

	public void setNumber2(long number2) {
		this.number2 = number2;
	}

	public long getResult() {
		return result;
	}

	public void setResult(long result) {
		this.result = result;
	}

	
	
	


	
}
