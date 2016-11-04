package org.insanedevelopment.jmxtransconverter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jmxtrans.model.Query;

public class WriteJson {

	public static void main(String[] args) throws JsonProcessingException {
		Query q = Query.builder().addAttr("test").setObj("java.lang:type=GarbageCollector,name=*").build();
		ObjectMapper om = new ObjectMapper();
		JsonNode tree = om.valueToTree(q);
		System.out.println(tree.toString());
	}

}
