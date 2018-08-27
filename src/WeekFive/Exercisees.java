package WeekFive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Exercisees {
	private static final String COMMA_DELIMITER = ",";
	private static final String FILE_HEADER = "key,value";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	public static void main(String[] args) {
		String fileName = "./src/WeekFive/cars.csv";
		String fileName2 = "./src/WeekFive/maps.csv";
//		CarCsvWriter writer = new CarCsvWriter();
//		writer.createCSV(fileName);
		Map<String, String> map = new HashMap<String,String>();
		map = readCSV(fileName2);
//		map.put("a", "apple");
//		map.put("b", "");
//		map.put("c", "meh");	
//		mapBully(map);
		displayMap(map);
//		writetoCSV(map, fileName2);
	
	}
	
	static Map<String, String> mapBully(Map<String, String> map){
		
		if (!map.get("a").isEmpty()) {
			String val = map.get("a");
			map.replace("b",val);
			map.replace("a", "");
		}
		
		return map;
	}
	static void displayMap(Map<String, String> map) {
//		for (String entry : map.keySet()) {
//			System.out.println(entry + ": " + map.get(entry)); 
//		}
		map.forEach((k,v) -> System.out.println(k+ ":" + v));
	}
	
	static void writetoCSV(Map<String, String>map, String fileName) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(FILE_HEADER+NEW_LINE_SEPARATOR);
			for (String entry: map.keySet()) {
				writer.write(entry+COMMA_DELIMITER);
				writer.write(map.get(entry)+COMMA_DELIMITER);
				writer.write(NEW_LINE_SEPARATOR);
			}
			
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	static Map<String, String> readCSV(String fileName) {
		Map <String, String> map = new HashMap<>();
		try {
			String line = "";
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			// skip header
			reader.readLine();
			
			while((line = reader.readLine())!= null) {
				String[] tokens = line.split(COMMA_DELIMITER);
//				if (tokens.length < 2) tokens = new String[]{tokens[0], ""};
				
				map.put(tokens[0], tokens[1]);
			}
			
			reader.close();
			return map;
		} catch (Exception e) {
			System.out.println(e);
		}
		return map;
	}
	
}