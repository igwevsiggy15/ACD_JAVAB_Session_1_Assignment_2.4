package assign2;

import java.util.Scanner;

public class assign2 {

	

		public static void main(String[] args){
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please enter an Integer between 0 and 255:");
			int x = scan.nextInt();
			
			if(x == 0){
				System.out.println("You have Entered Zero: " + Character.toString((char)x));
			}else if(x > 0){
				System.out.println("You have Entered Positive Value: " + Character.toString((char)x));
			}else{
				System.out.println("You have Entered Negative Value: " + Character.toString((char)x));
			}
			
			scan.close();
		}
	}

