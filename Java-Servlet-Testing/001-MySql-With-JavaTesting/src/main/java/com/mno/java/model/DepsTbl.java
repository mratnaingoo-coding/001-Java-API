package com.mno.java.model;

import lombok.Data;

@Data
public class DepsTbl {
	private int id;
	private String dep;
	private String location;
	private UsersTbl userid;
}
