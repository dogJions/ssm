package com.fym.controller;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseController<T> {

	@Autowired
	protected T baseService;
}
