package com.training.spring.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.training.spring.domain.Daycare;

public interface DaycareService {

	Daycare getDaycareById(String id) throws JsonParseException, JsonMappingException, IOException;
}
