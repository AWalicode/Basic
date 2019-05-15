package com.wostal.basic;

import java.util.Map;
import java.util.TreeMap;

public class Repository {
	
	private Map<String, String> data;
	
	public Repository() {
		data = new TreeMap<>();
		for(int i=0 ; i<100 ; i++) {
			data.put("key-"+ i, "value-"+i);
		}
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}
}
