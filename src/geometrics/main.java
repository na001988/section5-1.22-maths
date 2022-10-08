package geometrics;

import java.util.ArrayList;

public class main {
	
	//entry point, simulate user entry options
	
	static int sides=-1;

	public static void main(String[] args) {

		ArrayList<childDefinition> hs = new ArrayList<childDefinition>();
		
		calculations obj = new calculations();
		
		if(sides==3) {
			childDefinition c1 = new childDefinition(3.5,3,3);
			hs.add(c1);
		}
		
		else if(sides==4) {
			childDefinition c2 = new childDefinition(3,3,3.2,5);
			hs.add(c2);
		}
		
		else if(sides==5) {
			childDefinition c3 = new childDefinition(3,1.3,3,7,8);
			hs.add(c3);
		}
		
		else {
			System.out.println("Side: "+sides+" not defined or");
		}
		
		obj.compute(hs, sides);


	}

}
