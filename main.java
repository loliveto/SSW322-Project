package M2;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		int menuChoice = -1;
		Questionaire[] questionnaireList;
		
		System.out.println("The Questionnaire CLAN Presents:");
		System.out.println("Creat a Test or Survey!");
		while(true){
			System.out.println("Press 1 to Create a Survey\nPress 2 to Create a Test\nPress 3 to Take a Test\nPress 4 to View Your Tests/Surveys\nPress 0 to quit");
			
			Scanner choiceInput = new Scanner(System.in);
			menuChoice = Integer.parseInt(choiceInput.nextLine());
			
			switch(menuChoice){
				case 1:
					//code to create survey
					//name test
					System.out.println("What would you like to name your test?");
					Scanner nameInput = new Scanner(System.in);
					//set istest to true
					//create new questionnaire and add it to questionnairelist
					//ask type of question (keep asking until done)
					//add it to questionlist
				case 2:
					//code to create test
				case 3:
					break;
				case 4:
					//code to view test/survey
					//list all 
			}
		}		
		
	}
}
