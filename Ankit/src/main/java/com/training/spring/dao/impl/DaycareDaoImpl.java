package com.training.spring.dao.impl;

import java.io.IOException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.training.spring.dao.DaycareDao;
import com.training.spring.domain.Daycare;
import com.training.spring.util.JsonUtil;

@Repository
public class DaycareDaoImpl implements DaycareDao {

	@Override
	public Daycare getDaycareById(String id) throws JsonParseException, JsonMappingException, IOException {
		TransportClient client = new TransportClient();
		client.addTransportAddress(new InetSocketTransportAddress("localhost",9200));
		String daycareJson = client.prepareGet("daycare_qa", "daycare", id).execute().actionGet().getSourceAsString();
		return JsonUtil.toJava(daycareJson, Daycare.class);
	}

}
