package assignment2;

import java.util.Scanner;

public class Nim {
	/*
	 * @author Chris Jeong
	 * 
	 */

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Initial Number of Sticks: ");
		int initial = in.nextInt();
		int i = 0;
		int k = 0;
		
		while (initial > 0) {
			
			System.out.println("How Many Sticks Do You Want to Remove?: ");
			int value = in.nextInt();
			
			if (value == initial && i == 0 || value > 2 || initial<=0) {
	
				System.out.println("Illegal Move.");
			} else {	
				
				System.out.println("Round "+i+": "+initial+" at start, "+"human takes "+value+", so "+(initial-value)+" remain.");
				i++;
				initial-=value;
				k=initial;
				
				if (initial==0){
					initial=0;
					System.out.println("You Win!");
				}
				
				if (initial == 1) {
					int comp = initial;
					System.out.println("Round "+i+": "+initial+" at start, "+"computer takes "+comp+", so "+(initial-comp)+" remain.");
					System.out.println("Computer wins");
					initial=0;
				}
				
				if (initial == 1 && i % 2 == 0) {
					System.out.println("Round "+i+": "+initial+" at start, "+"human takes "+value+", so "+(initial-value)+" remain.");
					initial-=value;
					initial=0;
				} else if (initial >= 2) {	
					
					int comp = (int)((Math.random()*2)+1);
					System.out.println("Round "+i+": "+initial+" at start, "+"computer takes "+comp+", so "+(initial-comp)+" remain.");
					initial-=comp;
					k = initial;
					i++;
					
					if (initial == 0) {
						System.out.println("The computer wins");
					}
				}
			}
				//The best strategy for the computer is to have the human decide upon the value three and then choose the last one.
		}		
	}
}