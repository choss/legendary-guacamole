package org.insanedevelopment.jmxtransconverter.output;

import java.util.Collections;
import java.util.Properties;

import org.junit.Test;

public class SerializationTest {

	@Test
	public void testSerialization() {
		Properties o1p = new Properties();
		o1p.put("connectionUrl", "http://kinbana:9100");
		o1p.put("rootPrefix", "uat_index");
		OutputWriterConfigOutput o1 = new OutputWriterConfigOutput("com.googlecode.jmxtrans.model.output.elastic.ElasticWriter",
				Collections.singletonList("name"), null);
		QueryOutput q1 = new QueryOutput("java.lang:type=Memory", null, Collections.singletonList("HeapMemoryUsage"), null, "heap", null, null, null,
				Collections.singletonList(o1));

		String output = JsonUtils.createJson(q1);
		System.out.println(output);
	}

}
