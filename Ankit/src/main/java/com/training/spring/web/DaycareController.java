package com.training.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.domain.Daycare;

@RestController
@RequestMapping("/daycare")
public class DaycareController {

	@RequestMapping("/detail")
	public Daycare getDetail(int id){
		return null;
		
	}
}
