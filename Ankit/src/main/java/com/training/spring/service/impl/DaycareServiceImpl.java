package com.training.spring.service.impl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.training.spring.dao.DaycareDao;
import com.training.spring.domain.Daycare;
import com.training.spring.service.DaycareService;

@Service
public class DaycareServiceImpl implements DaycareService {

	@Autowired
	DaycareDao daycareDao;
	@Override
	public Daycare getDaycareById(String id) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		return daycareDao.getDaycareById(id);
	}

}
