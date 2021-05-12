package com.consumers.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.common.system.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/order")
@RestController
public class OrderController {

	@Reference
	OrderService orderService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") Integer id) {
		return orderService.getById(id).toString();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public String add(@RequestBody JSONObject jsonObject) {
		orderService.add(jsonObject);
		return "ok";
	}
}
