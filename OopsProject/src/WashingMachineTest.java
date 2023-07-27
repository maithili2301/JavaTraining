
public class WashingMachineTest {
	public static void main(String[] args) {

		WashingPowder washPowder = new WashingPowder(100, "Nirma", "Front Load", true, 10.0f);

		System.out.println("wash powder : " + washPowder); // toString is invoked
		Cloth cloth[] = new Cloth[8];
		cloth[0] = new Cloth("cotton", "white", 100, "shirt", true);
		cloth[1] = new Cloth("satin", "pink", 300, "top", false);
		cloth[2] = new Cloth("cotton", "black", 400, "pant", true);
		cloth[3] = new Cloth("cotton", "black", 400, "pant", true);
		cloth[4] = new Cloth("cotton", "black", 400, "pant", true);
		cloth[5] = new Cloth("cotton", "black", 400, "pant", true);
		cloth[6] = new Cloth("cotton", "black", 400, "pant", true);
		cloth[7] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[9] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[10] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[11] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[12] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[13] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[14] = new Cloth("cotton", "black", 400, "pant", true);
//		cloth[16] = new Cloth("cotton", "black", 400, "pant", true);
//	    cloth[17]=new Cloth("cotton","black",400,"pant",true);
//	    cloth[18]=new Cloth("cotton","black",400,"pant",true);
//	    cloth[12]=new Cloth("cotton","black",400,"pant",true);
		WashingMachine wahMachineObj = new WashingMachine("SAMSUNG",10);
		WashingMachine wahMachineObj1 = new WashingMachine("LG",10);
		WashingMachine wahMachineObj2 = new WashingMachine("Apple",10);
		wahMachineObj.start();
		wahMachineObj1.start();
		wahMachineObj2.start();
		
		try {
			wahMachineObj.join();
			wahMachineObj1.join();
			wahMachineObj2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		Water waterObj = new Water("Soft", 3, "warm");
		float valVoltage=(float) (Math.random());
		int unitsUsed=(int) (Math.random());
		
		Electricity electricityObj = new Electricity("AC", 20, 54, 5, "Adani");
//   	Laundry laundryObj=new Laundry();
		try {
			Laundry laundryObj = wahMachineObj.wash(washPowder, waterObj, electricityObj, cloth);
			System.out.println(laundryObj.toString());
		} catch (ClothsOverloaded e) {
			// TODO Auto-generated catch block
			System.out.println("Cloths Issue : " + e);
		} catch (ElectricityNotFound e) {
			// TODO Auto-generated catch block
		System.out.println("Electricity Issue : "+e);
		}

//		System.out.println("Running main....");
//		WashingMachine washingMachineObj1=new WashingMachine();
//		washingMachineObj1.run();
//		washingMachineObj1.start();
	}
}

class Machine extends Thread {

}

class WashingMachine extends Machine { // isA
     String model;
     int delay;
	WashingTub washTub = new WashingTub(3, "Steel"); // hasA
	public WashingMachine(String model,int delay) {
		this.model=model;
		this.delay=delay;
	}
	public void run() { //2 

		for(int i=1;i<=10;i++) {
			System.out.println(model + " Machine is running..."+i);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) throws ClothsOverloaded, ElectricityNotFound{

		if (cloth.length > 15) {
			ClothsOverloaded ex1 = new ClothsOverloaded("Oh No.... Cloths limit exceeded.........");
			throw ex1;
		}
		
		if(elect.getVoltage()<=0) {
			ElectricityNotFound ex2=new ElectricityNotFound("Electricity Not available.....");
			throw ex2;
		}

		
		if(elect.getUnitUsed()>10) {
            ElectricityOverused eo1=new ElectricityOverused("Oh nooo..........Electricity Overused");
            throw eo1;

		}
		float cost = washPowder.getPrice() + (elect.getCostPerUnit() * elect.getUnitUsed());

		return new Laundry(cloth.length, 1.5f, water.getQuantity(), elect.getUnitUsed(), washPowder.getPrice(), cost);
	}
}

class Laundry {
	private int numberOfCloths; // cloth.length
	private float timeRequired;
	private float totalCost;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //

	private float costPerCloth = (float) 12.0;
	private float costPerLitWater = (float) 3.0;
//	private float electricityPerUnit=(float) 5.0;

	private float totalCostOfCloth;
	private float tolalCostOfWater;
	private float totalCostOfElectricity;

	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;

	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder + "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public float getTotalCostOfCloth() {
		return totalCostOfCloth;
	}

	public void setTotalCostOfCloth(float totalCostOfCloth) {
		this.totalCostOfCloth = numberOfCloths * costPerCloth;
	}

	public float getTolalCostOfWater() {
		return tolalCostOfWater;
	}

	public void setTolalCostOfWater(float tolalCostOfWater) {
		this.tolalCostOfWater = waterUsed * costPerLitWater;
	}

	public float getTotalCostOfElectricity() {
		return totalCostOfElectricity;
	}

//	public void setTotalCostOfElectricity(float totalCostOfElectricity) {
//		this.totalCostOfElectricity = electricityPerUnit*electricityUsed;
//	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}

}

class Tub {

}

class WashingTub extends Tub {
	private int capacity;
	private String type; //

	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Powder {

}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;

	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}

	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*
	 * public String toString() { String str = (scented) ? "Scented" :"Not Scented";
	 * return str+ " "+brand+" Washing Powder of "+type+
	 * " type quantity used "+quantity+ " grams "; }
	 */

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}

class Water {
	private String type;
	private int quantity;
	private String temperature;

	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; // ac dc
	private float voltage;
	private int costPerUnit;
	private int unitUsed;
	private String supplier;

	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}

	public Electricity(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getVoltage() {
		return voltage;
	}

	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}

	public int getUnitUsed() {
		return unitUsed;
	}

	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //

	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}

	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isClean() {
		return clean;
	}

	public void setClean(boolean clean) {
		this.clean = clean;
	}

}

class ClothsOverloaded extends Exception // checked
{
	ClothsOverloaded(String msg) {
		super(msg);
	}
}

class ElectricityNotFound extends Exception
{
    ElectricityNotFound(String msg) {
		super(msg);
	}
}
class ElectricityOverUsed extends RuntimeException{
	ElectricityOverUsed(String msg){
		super(msg);
	}
	
}

class ElectricityOverused extends RuntimeException // checked
{
	ElectricityOverused(String msg) {
		super(msg);
	}
}
