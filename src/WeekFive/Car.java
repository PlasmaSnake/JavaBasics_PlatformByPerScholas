package WeekFive;

public class Car{
	private String model;
	private int enginePower;
	private String color;
	private int manufactureYear;
	
	public Car(String model, int enginePower, String color, int manufactureYear) {
		this.model = model;
		this.enginePower = enginePower;
		this.color = color;
		this.manufactureYear = manufactureYear;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getEnginePower() {
		return enginePower;
	}
	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getManufactureYear() {
		return manufactureYear;
	}
	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}
	
	
			
}
