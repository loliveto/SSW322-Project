package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		int menuChoice = -1;
		ArrayList<Questionaire> questionnaireList = new ArrayList<Questionaire>();
		ArrayList<AnswerSheet> answerSheetList = new ArrayList<AnswerSheet>();
		
		System.out.println("The Questionnaire CLAN Presents:");
		System.out.println("Creat a Test or Survey!");
		while(true){
			System.out.println("Press 1 to Create a Test\nPress 2 to Create a Survey\nPress 3 to Take a Test\nPress 4 to View Your Tests/Surveys\nPress 0 to quit");
			
			Scanner choiceInput = new Scanner(System.in);
			menuChoice = Integer.parseInt(choiceInput.nextLine());
			
			switch(menuChoice){
				case 1:
					//code to create test
					Questionaire test = new Questionaire();
					questionnaireList.add(test);
					
					//name test
					System.out.println("What would you like to name your test?");
					Scanner nameInput = new Scanner(System.in);
					test.name = nameInput.nextLine();
					
					//set istest to true
					test.isATest = true;
					
					//ask type of question (keep asking until done)
					System.out.println("Now you can add questions to your test.");
					String cont = "y";
					
					//adding questions
					while(cont.equals("y")){
						System.out.println("\nWhat type of question would you like to use?");
						System.out.println("Press 1 for Multiple Choice\nPress 2 for True/False\nPress 3 for Short Answer\nPress 4 for Essay Question\nPress 5 for Ranking\nPress 6 for Matching");
						Scanner qInput = new Scanner(System.in);
						int qChoice;
						qChoice = Integer.parseInt(qInput.nextLine());
						Question q =  null;
						
						//creates question
						switch(qChoice){
							case 1:
								q = new MultipleChoice();
								String qcont = "y";
								q.setPrompt();
								while(qcont.equals("y")){
									q.setOption();
									System.out.println("Would you like to add another option?(y/n)");
									Scanner scan = new Scanner(System.in);
									qcont = scan.nextLine();
								}

								break;
								
							case 2:
								q = new TrueFalse();
								break;
								
							case 3:
								q = new OpenEnded("s");
								break;
								
							case 4:
								q = new OpenEnded("l");
								break;
								
							case 5:
								q = new Ranking();
								break;
								
							case 6:
								q = new Matching();
								break;
						}
						//adds question to questionlist
						test.addQuestion(q);
						
						System.out.println("Would you like to add another question? (y/n)");
						Scanner contInput = new Scanner(System.in);
						cont = contInput.nextLine();
					}
					
					//add it to questionlist
					break;
					
				case 2:
					//code to create Survey
					break;
					
				case 3:
					break;
					
				case 4:
					//code to view test/survey
					//list all 
					break;
					
				default:
					break;
				//end of switch
			}
			
			//end of while
		}		
		
	}
}
