package com.wostal.basic;

import java.util.Map;

public class PrepareService {
	
	public static String mapToCsvExportString(Map<String, String> map) {
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, String> entry : map.entrySet()) {
			sb.append(entry.getKey()).append(";").append(entry.getValue()).append("\n");
		}
		return sb.toString();
	}
}
