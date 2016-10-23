package Ex5q2;

public class Cars {
	private String make;
	private String  model; 
	private double engineSize;
	private String engineType;
	private String regNumber;
	
	public Cars(String make, String model, double engineSize, String engineType, String regNumber) {
		super();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.regNumber = regNumber;
	}
	public Cars(String make, String model, double engineSize, String engineType) {
		
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.regNumber = null;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String toString() {
		return "carConstucter [make=" + make + ", model=" + model
				+ ", engineSize=" + engineSize + ", engineType=" + engineType
				+ ", regNumber=" + regNumber + "]";
	}

}
