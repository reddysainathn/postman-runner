package com.postman.runner.dto;

public class PostmanDTO {

	private String key;

	private String value;

	private Integer id;

	private String name;

	public PostmanDTO() {
	}

	public PostmanDTO(String key, String value, Integer id, String name) {
		this.key = key;
		this.value = value;
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
