package com.provider.system.service;

import com.common.system.service.ShowService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class ShowServiceImpl implements ShowService {

	@Override
	public String name(String name) {
		return name;
	}

	@Override
	public Integer age(Integer age) {
		return age;
	}

	@Override
	public String sex(String sex) {
		return sex;
	}

}
