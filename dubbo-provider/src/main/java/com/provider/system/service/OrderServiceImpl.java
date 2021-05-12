package com.provider.system.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.common.system.service.OrderService;
import com.provider.system.bean.Order;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@Service
public class OrderServiceImpl implements OrderService<JSONObject> {

	private HashMap<Integer, Order> map = new HashMap<>();

	@Override
	public JSONObject getById(Integer id) {
		return JSONObject.parseObject(map.get(id).toString());
	}

	@Override
	public void add(JSONObject o) {
		Order order = o.toJavaObject(Order.class);
		map.put(order.getId(), order);
	}
}
