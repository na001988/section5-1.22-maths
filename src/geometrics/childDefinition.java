package geometrics;

public class childDefinition {
	double side1=0;
	double side2=0;
	double side3=0;
	double side4=0;
	double side5=0;
	
	public childDefinition(double a, double b, double c) {
		//method for a triangle
		this.side1=a;
		this.side2=b;
		this.side3=c;
		
	}

	public childDefinition(double a, double b, double c, double d) {
		//method for a square
		this.side1=a;
		this.side2=b;
		this.side3=c;
		this.side4=d;
		
	}
	
	public childDefinition(double a, double b, double c, double d, double e) {
		//method for a pentagon
		this.side1=a;
		this.side2=b;
		this.side3=c;
		this.side4=d;
		this.side5=e;
		
	}	
}
