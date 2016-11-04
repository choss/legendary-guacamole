package org.insanedevelopment.jmxtransconverter.output;

import java.util.HashMap;
import java.util.Map;

import com.cedarsoftware.util.io.JsonWriter;

public class JsonUtils {

	public static String createJson(Object item) {
		Map<String, Object> arguments = new HashMap<>();
		arguments.put(JsonWriter.PRETTY_PRINT, true);
		arguments.put(JsonWriter.TYPE, false);
		arguments.put(JsonWriter.SKIP_NULL_FIELDS, true);

		String output = JsonWriter.objectToJson(item, arguments);
		return output;
	}
}
