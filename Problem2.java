package assignment2;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				
				
			//Create new scanner object
			Scanner myObj = new Scanner(System.in)) {
			
			//Prompt user to input their grade
			System.out.println("Please enter your grade: ");
			//Creating a variable 'mark' for percentage of marks
			int mark = myObj.nextInt();
			//Creating variable to make case statements smaller
			int cse_mark = mark / 10;
			//Letter grade variable initializing
			String letter = null;
			
			//If-statement for in case user inputs grade not in the chart
			if(cse_mark > 10 || cse_mark < 0)
			{
				System.out.println("INVALID GRADE");
			}
			else
			{
				//Switch-Case Statement
				switch(cse_mark)
				{
				//Case for a 60 to 69 mark
				case 6:
					letter = "D";
					break;
				//Case for a 70 to 79 mark
				case 7:
					letter = "C";
					break;
				//Case for 80 to 89 mark
				case 8:
					letter = "B";
					break;
				case 9:
					letter = "A";
					break;
				case 10:
					letter = "A";
					break;
				//Default case for any other grade input
				default:
					letter = "F";
					break;
				}
			}
			System.out.println("Your letter grade is: " + letter);
			
		}
	}
}
		



