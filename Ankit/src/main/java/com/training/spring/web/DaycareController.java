package com.training.spring.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.training.spring.domain.Daycare;
import com.training.spring.service.DaycareService;

@RestController
@RequestMapping("/daycare")
public class DaycareController {
	@Autowired
	DaycareService daycareService;

	@RequestMapping("/detail/{id}")
	public Daycare getDetail(@PathVariable String id) throws JsonParseException, JsonMappingException, IOException{
		return daycareService.getDaycareById(id);
		
	}
}
