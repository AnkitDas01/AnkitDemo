package com.training.spring.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	public static String toJson(Object obj) throws JsonProcessingException{
		ObjectMapper om = new ObjectMapper();
		return om.writeValueAsString(obj);
	}
	
	public static <T> T toJava(String json, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper om = new ObjectMapper();
		return om.readValue(json, clazz);
	}
}
