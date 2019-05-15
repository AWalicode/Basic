package com.wostal.basic;

import java.io.FileWriter;
import java.io.IOException;

public class Exporter {
	
	public static boolean stringToCsv(String str) {
		try {
			FileWriter fileWriter = new FileWriter("export.csv");
			fileWriter.write(str);
			fileWriter.flush();
			fileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
