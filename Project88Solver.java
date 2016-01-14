package Problems;

import java.util.*;

public class Project88Solver {
	
	public static void main(String[] args){
		// do something
		
		
		
		Prob88SolutionGen sg = new Prob88SolutionGen(5);
		
		int[] tempArray;
		for (int i=0; i < 40; i++){
			tempArray = sg.getTemp();
			for (int x : tempArray){
				System.out.print(x+",");
			}
			System.out.println();
			sg.increment();
		}
		
	}
	
}
