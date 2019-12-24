package com.sundongliang.cms.utils;

import java.io.IOException;
import java.util.List;

public class Abcd {

	public static void main(String[] args) throws IOException {
		
		FileUtils file = new FileUtils();
		List<String> readByLines = file.readByLines("C:\\Users\\asus\\Desktop\\呵呵.txt");
		
		for (String string : readByLines) {
			System.out.println(string);
		}
	}
}
