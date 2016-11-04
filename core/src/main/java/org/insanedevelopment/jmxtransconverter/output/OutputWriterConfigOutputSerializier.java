package org.insanedevelopment.jmxtransconverter.output;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import com.cedarsoftware.util.io.JsonWriter.JsonClassWriterEx;

public class OutputWriterConfigOutputSerializier implements JsonClassWriterEx {

	@Override
	public void write(Object o, boolean showType, Writer output, Map<String, Object> args) throws IOException {
		OutputWriterConfigOutput item = (OutputWriterConfigOutput) o;
		output.write("\"@class\":");
		output.write(item.getOutputWriterclass());
	}

}
