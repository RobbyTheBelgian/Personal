package Problems;

import java.util.Iterator;

public class Prob88SolutionGen implements Iterator<Integer>{
	
	/*
	 * Invariants:
	 * 1) sumSoFar = sum of all elements in sol[0...(changeIndex-1)]
	 * 2) prodSoDar = product of all elements in sol[0...(changeIndex-1)]
	 * 3) possibleSol = true unless there can be no further solutions
	 * 4) the current position indicates the next solution (if possible), and otherwise possibleSol will be false.
	 * 5) sol[changeIndex] < sol[changeIndex-1]
	 * 6) for each i < changeIndex: sol[i-1] >= sol[i]
	 * 7) sol[0] <= maxCoeff
	 * 8) changeIndex > 0
	 * 9) prodSoFar*sol[changeIndex] < maxSol
	 */
	
	private final int k;
	private int maxSol;
	private int changeIndex;
	private int sumSoFar;
	private int prodSoFar;
	private int maxCoeff;
	private int[] sol;
	private boolean possibleSol;
	public Prob88SolutionGen(int k){
		this.k = k;
		this.maxCoeff = k;
		this.maxSol = 2*k+1;
		this.sol = new int[k];
		this.sol[0] = 2; this.sol[1] = 2;
		this.prodSoFar = 4;
		this.sumSoFar = 4;
		this.changeIndex = 2;
		this.possibleSol = true;
		findNextSol();
	}
	
	void findNextSol(){
		/*
		 * increments() until either a solution is found or no further solutions are possible.
		 */
		
	}
	
	public int[] getTemp(){
		
		return this.sol ;
	}
	
	
	void increment(){
		sol[changeIndex]++;
		if 
		if (sol[changeIndex] == sol[changeIndex-1]){
			/*
			 * TODO: this is where the magic happens
			 */
		}
	}
	
	public boolean verifySol(){
		return (sumSoFar+sol[changeIndex]+k-changeIndex-1 == prodSoFar*sol[changeIndex]);
	}
	
	public boolean hasNext(){
		/*
		 * TODO
		 */
		return false;
	}
	
	public Integer next(){
		/*
		 * TODO
		 */
		return new Integer(0);
	}
	
	public void remove(){
		
	}
	
}
