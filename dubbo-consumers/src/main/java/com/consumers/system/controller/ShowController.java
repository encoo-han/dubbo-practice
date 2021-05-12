package com.consumers.system.controller;

import com.common.system.service.ShowService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShowController {

	@Reference
	private ShowService showService;

	@ResponseBody
	@RequestMapping(value = "/name",method = RequestMethod.GET)
	public String name(){
		return showService.name("hujinghan");
	}
}
