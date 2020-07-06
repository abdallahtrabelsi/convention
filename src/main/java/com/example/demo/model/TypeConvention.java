package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

public class TypeConvention {
	private static List<String> Types = Arrays.asList("universitaire", "industrielle nationale", "industrielle");

	public static List<String> getTypes() {
		return Types;
	}

	public void setTypes(List<String> types) {
		Types = types;
	}

}