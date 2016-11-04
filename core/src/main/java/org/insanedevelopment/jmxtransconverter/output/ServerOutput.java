package org.insanedevelopment.jmxtransconverter.output;

import java.util.List;

public class ServerOutput {

	private String alias;
	private String pid;
	private String host;
	private String port;
	private String username;
	private String password;
	private String protocolProviderPackages;
	private String url;
	private String cronExpression;
	private Integer runPeriodSeconds;
	private Integer numQueryThreads;
	private Boolean local;
	private List<QueryOutput> queries;

	public ServerOutput(String alias, String pid, String host, String port, String username, String password, String protocolProviderPackages, String url,
			String cronExpression, Integer runPeriodSeconds, Integer numQueryThreads, boolean local, List<QueryOutput> queries) {
		super();
		this.alias = alias;
		this.pid = pid;
		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
		this.protocolProviderPackages = protocolProviderPackages;
		this.url = url;
		this.cronExpression = cronExpression;
		this.runPeriodSeconds = runPeriodSeconds;
		this.numQueryThreads = numQueryThreads;
		this.local = local;
		this.queries = queries;
	}

}
