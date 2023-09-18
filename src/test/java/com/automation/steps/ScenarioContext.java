package com.automation.steps;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

	private Map<String, Object> context;
	
	public ScenarioContext() {
		context=new HashMap<String, Object>();
	}
	
	public void setContext(String key,String value) {
		context.put(key, value);
	}
	
	public Object getContext(String key) {
		return context.get(key);
	}
}
