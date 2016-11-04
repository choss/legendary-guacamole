package org.insanedevelopment.jmxtransconverter.output;

import java.util.List;

public class QueryOutput {

	private String obj;
	private List<String> keys;
	private List<String> attr;
	private List<String> typeNames;
	private String resultAlias;
	private Boolean useObjDomainAsKey;
	private Boolean allowDottedKeys;
	private Boolean useAllTypeNames;
	private List<OutputWriterConfigOutput> outputWriters;

	public QueryOutput(String obj, List<String> keys, List<String> attr, List<String> typeNames, String resultAlias, Boolean useObjDomainAsKey,
			Boolean allowDottedKeys, Boolean useAllTypeNames, List<OutputWriterConfigOutput> outputWriters) {
		super();
		this.obj = obj;
		this.keys = keys;
		this.attr = attr;
		this.typeNames = typeNames;
		this.resultAlias = resultAlias;
		this.useObjDomainAsKey = useObjDomainAsKey;
		this.allowDottedKeys = allowDottedKeys;
		this.useAllTypeNames = useAllTypeNames;
		this.outputWriters = outputWriters;
	}

}
