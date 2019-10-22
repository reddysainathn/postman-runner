package com.postman.runner.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Strings;
import com.postman.runner.dto.PostmanDTO;
import com.postman.runner.model.PostmanDAO;

@RestController("/postman")
public class PostmanController {

	private static final Logger logger = LoggerFactory.getLogger(PostmanController.class);

	@PostMapping("/runner/{id}")
	public PostmanDTO runner(@PathVariable Integer id, @RequestParam String name, @RequestBody PostmanDAO postmanDto) {
		PostmanDTO postmanDTO = new PostmanDTO();
		if (id != null)
			postmanDTO.setId(id);
		if (!Strings.isNullOrEmpty(name))
			postmanDTO.setName(name);
		if (postmanDto != null) {
			if (!Strings.isNullOrEmpty(postmanDto.getKey()))
				postmanDTO.setKey(postmanDto.getKey());
			if (!Strings.isNullOrEmpty(postmanDto.getValue()))
				postmanDTO.setValue(postmanDto.getValue());
		}
		logger.info("Respone ID : '{}', Name : '{}', Key : '{}', Value : '{}'", id, name, postmanDTO.getValue(),
				postmanDTO.getValue());
		return postmanDTO;
	}

}
