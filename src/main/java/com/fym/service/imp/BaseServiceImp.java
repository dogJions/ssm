package com.fym.service.imp;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImp<T> {
	
	@Autowired
	protected T mapper;
}
