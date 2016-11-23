package com.training.spring.dao;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.training.spring.domain.Daycare;

public interface DaycareDao {
	Daycare getDaycareById(String id) throws JsonParseException, JsonMappingException, IOException;
}
