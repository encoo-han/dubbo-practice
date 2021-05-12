package com.provider.system.bean;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Order {

	private Integer id;
	private String uuid;
	private Date date;
	private String description;

}
