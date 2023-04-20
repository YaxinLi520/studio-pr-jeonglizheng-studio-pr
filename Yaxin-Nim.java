package assignment2;

import java.util.Scanner;

/**
 * 
 * @author Yaxin Li
 *
 */
public class Nim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the number of initial sticks: ");
		int initialSticks = in.nextInt();
		
		int beginSticks = initialSticks;
		int endSticks = initialSticks;
		int round = 0;
		int human = 0;
		int computer = 0;
		
		while (beginSticks > 0){
			System.out.println("Please enter the number of sticks you'll remove (1 or 2): ");
			human = in.nextInt();
			
			while ((human != 2 && human != 1) || (human > beginSticks)){
				System.out.println("Please enter a valid number (1 or 2) / a smaller number: ");
				human = in.nextInt();
			}
			
			endSticks -= human;
			
			System.out.println("Round " + round + ": " + beginSticks + " at start human takes "
			+ human + ", so " + endSticks + " remain.");
			
			beginSticks = endSticks;
			round ++;
			
			if (beginSticks > 0){
				computer = (int) Math.round(Math.random() + 1);
				
				while (computer > beginSticks){
					computer = (int) Math.round(Math.random() + 1);
				}
				
				endSticks -= computer;
				
				System.out.println("Round " + round + ": " + beginSticks + " at start computer takes "
						+ computer + ", so " + endSticks + " remain.");
				
				beginSticks = endSticks;
				round ++;
				
				if (beginSticks == 0){
					System.out.println("The computer wins / you lose!");
				}
				
			} else {
				System.out.println("The computer loses / you win!");
			}
			
		}
		
	}

}
