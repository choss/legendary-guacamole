package org.insanedevelopment.jmxtransconverter.output;

import java.util.List;
import java.util.Properties;

public class OutputWriterConfigOutput {

	private String outputWriterclass;
	private List<String> typeNames;
	private Properties outputWriterConfig;

	public OutputWriterConfigOutput(String outputWriterclass, List<String> typeNames, Properties outputWriterConfig) {
		super();
		this.outputWriterclass = outputWriterclass;
		this.typeNames = typeNames;
		this.outputWriterConfig = outputWriterConfig;
	}

	public String getOutputWriterclass() {
		return outputWriterclass;
	}

	public void setOutputWriterclass(String outputWriterclass) {
		this.outputWriterclass = outputWriterclass;
	}

	public List<String> getTypeNames() {
		return typeNames;
	}

	public void setTypeNames(List<String> typeNames) {
		this.typeNames = typeNames;
	}

	public Properties getOutputWriterConfig() {
		return outputWriterConfig;
	}

	public void setOutputWriterConfig(Properties outputWriterConfig) {
		this.outputWriterConfig = outputWriterConfig;
	}

}
