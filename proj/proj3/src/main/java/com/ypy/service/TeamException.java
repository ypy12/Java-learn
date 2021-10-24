package com.ypy.service;

import java.io.Serializable;

public class TeamException extends Exception implements Serializable{
    private static final long serialVersionUID = 1L;

	public TeamException() {
	}

	public TeamException(String message) {
		super(message);
	}
}
