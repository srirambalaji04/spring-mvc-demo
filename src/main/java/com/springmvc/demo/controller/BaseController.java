package com.springmvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import com.springmvc.demo.common.IConstants;

@Controller
public class BaseController implements IConstants {

	@Autowired
	protected MessageSource messageSource;

}
