package com.parser.models;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Test1 {
	BONY(true, true, 0), TONY(false, true, 1), IBM(false, false, 3);

//	@JsonIgnore
	private final boolean isFollow;
//	@JsonIgnore
	private final boolean isNotFollow;
	private final int value;

	
//	Test1(int dir){
//		this(false, false, dir);
//	}
	Test1(boolean isFollow, boolean isNotFollow, int value) {
		this.isFollow = isFollow;
		this.isNotFollow = isNotFollow;
		this.value = value;
	}
	
	public boolean isFollow() {
		return isFollow;
	}

	public boolean isNotFollow() {
		return isNotFollow;
	}

	public int getValue() {
		return value;
	}

	@JsonCreator
	public static Test1 fromInteger(int v) {
		for(Test1 value: Test1.values()) {
			if(value.getValue() == v)
				return value;
		}
		return BONY;
	}
	
	public static Integer getInteger(Integer flag) {
		return fromInteger(flag).getValue();
	}
}
