package com.parser.models;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Test2 {
	ELE("ele"), BLE("ble");

	private final String v;

	Test2(String v) {
		this.v = v;
	}

	public String getV() {
		return v;
	}

	@JsonCreator
	public static Test2 fromString(String v) {
		for (Test2 t2 : Test2.values()) {
			if (t2.v.equals(v)) {
				return t2;
			}
		}
		return null;
	}
}
