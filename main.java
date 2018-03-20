package M2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		int menuChoice = -1;
		
		while(menuChoice!=0){
			System.out.println("The Questionnaire CLAN Presents:");
			System.out.println("Creat a Test or Survey!");
			System.out.println("Press 1 to Create a Survey\nPress 2 to Create a Test\nPress 3 to Take a Test\nPress 4 to View Your Tests/Surveys\nPress 0 to quit");
			
			Scanner scan1 = new Scanner(System.in);
			menuChoice = Integer.parseInt(scan1.nextLine());
			
			switch(menuChoice){
				case 1:
					//code to create survey
				case 2:
					//code to create test
				case 3:
					
				case 4:
					//code to view test/survey
			}
		}		
		
	}
}
