package com.app.one;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class SampleOne {
	
	@Test
	public void test1() {
		try {
			FileReader read = new FileReader("C:\\Users\\Yuvaraj\\eclipse-workspace\\Sample_AP\\src"
					+ "\\test\\resources\\sample.json");
			JSONParser job = new JSONParser();
			// Object 
			Object obj = job.parse(read);
			//obj -> json obj
			JSONObject ob = (JSONObject)obj;
			String name = (String)ob.get("name");
			System.out.println(name);
			String stuname = (String)ob.get("Studentname");
			System.out.println(stuname);
			JSONArray jar=(JSONArray)ob.get("courses");
			for (Object object : jar) {
				System.out.println(object);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
