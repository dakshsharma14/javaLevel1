public class Cabbage {
	
	//fields
	 private double weight;
	 private double costPerKilogram;
	 private double price;
	 
	
	 public Cabbage() {
		 weight = 0.0;
		 costPerKilogram = 0.0;
		 }
	
	//Getters and setters methods
	public double getWeight() {                //getter and setter of weight
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getCostPerKilogram() {       // getter and setter of costPerKilogram
		return costPerKilogram;  
	}
	public void setCostPerKilogram(double costPerKilogram) {
		this.costPerKilogram = costPerKilogram;
	}
	
	
	//worker method for Price
	public double calculateprice() {
	    return price  = weight * costPerKilogram;    //calculating price
	}
	
	
	//printReport() method
	public void printReport() {
		System.out.println("Cabbage: weight "+ weight +", cost per kilogram "+ costPerKilogram);
		}
	
	
	//testing overloaded method
	 public Cabbage(double weight1, double costPerKilogram1) {
		 this.weight = weight1;
		 this.costPerKilogram = costPerKilogram1;
	 }
	
	//printReport() worker method of anotherCabbage
	public void printReport(double weight1, double costPerKilogram1) {
		System.out.println("Cabbage: weight "+weight1 +", cost per kilogram "+costPerKilogram1);
	}
}
	
	
	


		
	
	
	
