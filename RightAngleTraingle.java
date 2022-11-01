/*
 *This class abstract a RightAngleTriangle with fields for adjacent
 *and opposite. There are three worker methods and one print report
 *that calculates hypotenuse, perimeter and area of right-angle triangle. 
 */
public class RightAngleTraingle {
	private double adjacent;
	private double opposite;
	
	//No-argument co-nstructor
	public RightAngleTraingle() {
		adjacent = 0.0;
		opposite = 0.0;
	}
	
	//parameterized constructer
	public RightAngleTraingle(double adjacent, double opposite) {
		this.adjacent= adjacent;           
		this.opposite= opposite;
	}
	
	//accessor for Adjacent
	public double getAdjacent() {
		return adjacent;
	}
	
	// mutator for opposite 
	public void setAdjacent(double adjacent) {
		this.adjacent = adjacent;
	}
	
	//accessor for Opposite
	public double getOpposite() {
		return opposite;
	}
	
	//mutator for opposite 
	public void setOpposite(double opposite) {
		this.opposite = opposite;
	}
	
	//worker method to claculate hypotenuse
	public double calculateHypotenuse() {
		double hypotenuse;
		hypotenuse= Math.sqrt(Math.pow(adjacent, 2)+ Math.pow(opposite, 2));
		return hypotenuse;
	}
	
	//worker method to calculate perimeter 
	public double calculatePerimeter() {
		double hypotenuse = calculateHypotenuse();
		double perimeter;
		perimeter = adjacent + opposite + hypotenuse; 
		return perimeter;
	}
	
	//worker method to calculate area
	public double calculateArea() {
		double area = (adjacent * opposite)/2 ; 
		return area;
	}
	
	//print report
    public String createReport() { 
    	System.out.printf("adjacent %.4f %n",getAdjacent() + ", opposite %.4f %n",getOpposite() + ", hypotenuse %.4f %n",calculateHypotenuse());
   return null;
    }
}
