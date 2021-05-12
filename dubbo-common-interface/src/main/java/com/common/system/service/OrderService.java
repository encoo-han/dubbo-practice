package com.common.system.service;

public interface OrderService<T> {

	T getById(Integer id);

	void add(T t);

}
