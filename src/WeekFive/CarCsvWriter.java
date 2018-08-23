package WeekFive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CarCsvWriter {
	//Delimiters for CSV File.
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV File header
	private static final String FILE_HEADER = "model,enginePower,color,manufactureYear";
	
	//Method to write/create Car Objects into CSV.
	public void createCSV(String fileName) {
		Car c1 = new Car("Ferrari", 300, "Red", 1983);
		Car c2 = new Car("Mustang", 325, "Red", 1986);
		Car c3 = new Car("Jeep", 123, "Red", 1991);
		Car c4 = new Car("Honda", 232, "Red", 2003);
		Car c5 = new Car("Toyota", 142, "Red", 2013);
		
		List<Car> cars = new ArrayList<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
			writer.write(FILE_HEADER+NEW_LINE_SEPARATOR);
			for (Car obj : cars) {
				writer.write(obj.getModel() + COMMA_DELIMITER);
				writer.write(obj.getEnginePower() + COMMA_DELIMITER);
				writer.write(obj.getColor() + COMMA_DELIMITER);
				writer.write(obj.getManufactureYear() + COMMA_DELIMITER);
				writer.write(NEW_LINE_SEPARATOR);
			}
			
			writer.close();

		} catch (Exception e){
			System.out.println(e.getStackTrace());
		}
	}
}
