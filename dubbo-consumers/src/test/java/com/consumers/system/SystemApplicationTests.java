package com.consumers.system;

import com.common.system.service.ShowService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SystemApplicationTests {

	@Reference
	private ShowService showService;

	@Test
	void contextLoads() {
		showService.name("hujinghan");
	}

}
