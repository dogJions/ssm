package com.fym.controller;

import org.springframework.beans.factory.annotation.Autowired;
//1111
public class BaseController<T> {
   
	@Autowired
	protected T baseService;
}
