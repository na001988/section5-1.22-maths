package geometrics;

import java.util.ArrayList;

public class calculations {
	
	private double a1 = 0;
	private double b1 = 0;
	private double c1 = 0;
	private double d1 = 0;
	private double e1 = 0;
	private double t1 = 0;

	ArrayList<childDefinition> p = new ArrayList<childDefinition>(); 
	
	public void compute(ArrayList<childDefinition> obj, int sides) {
		
		try {
			
			if(sides==3) {
				obj.forEach((x) -> {
				 a1 = x.side1;
				 b1 = x.side2;
				 c1 = x.side3;
				 t1 = (a1+b1+c1)/3;
				
				System.out.println("The value is:"+t1);
				});
			}
			
			if(sides==4) {
				obj.forEach((x) -> {
				 a1 = x.side1;
				 b1 = x.side2;
				 c1 = x.side3;
				 d1 = x.side4;
				 t1 = (a1+b1+c1+d1)/4;	
				System.out.println("The value is:"+t1);
				});
			}
			
			if(sides==5) {
				obj.forEach((x) -> {
				 a1 = x.side1;
				 b1 = x.side2;
				 c1 = x.side3;
				 d1 = x.side4;
				 e1 = x.side5;
				 t1 = (a1+b1+c1+d1+e1)/5;
				System.out.println("The value is:"+t1);
				});
			}
			
			if(sides<3 || sides >5) {
				System.out.println("not a valid side....");
			}


		}catch(Exception e) {
			System.out.println("Exception at method compute(x,y) > "+e);
		}
		
		finally {
			notification();
		}
	}
	
	void notification() {
		System.out.println("Program completed...");
	}

}
