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
					AnswerSheet answerSheet = new AnswerSheet(1);
					answerSheetList.add(answerSheet);
					
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
								q.hasCorrectBeenSet = false;
								while(qcont.equals("y")){
									q.setOption();
									if(test.isATest==true){
										String qcont1 = "y";
										if(!q.hasCorrectBeenSet){
											System.out.println("Is this the correct answer? (y/n)");
											Scanner scan = new Scanner(System.in);
											qcont1 = scan.nextLine();
											if(qcont1.equals("y")){
												answerSheet.addCorrectAnswer(q.getOption());
												q.hasCorrectBeenSet=true;
											}
										}
									}
									System.out.println("Would you like to add another option?(y/n)");
									Scanner scan = new Scanner(System.in);
									qcont = scan.nextLine();
								}
								break;
								
							case 2:
								q = new TrueFalse();
								q.setPrompt();
								q.setOption();
								System.out.println("Is the answer true(t) or false(f)?");
								String tf = "";
								Scanner scan = new Scanner(System.in);
								tf = scan.nextLine();
								if(tf.equals("t")){
									answerSheet.addCorrectAnswer("True");
								}else if(tf.equals("f")){
									answerSheet.addCorrectAnswer("False");
								}
								break;
								
							case 3:
								q = new OpenEnded("s");
								q.setPrompt();
								answerSheet.addCorrectAnswer("");
								break;
								
							case 4:
								q = new OpenEnded("l");
								q.setPrompt();
								answerSheet.addCorrectAnswer("");
								break;
								
							case 5:
								q = new Ranking();
								String qcontR = "y";
								q.setPrompt();
								while(qcontR.equals("y")){
									q.setOption();
									if(test.isATest==true){
										String qcont1 = "y";
										answerSheet.addCorrectAnswer("");
										q.hasCorrectBeenSet=true;
									}
									System.out.println("Would you like to add another option?(y/n)");
									Scanner scan1 = new Scanner(System.in);
									qcontR = scan1.nextLine();
								}
								break;
								
							case 6:
								q = new Matching();
								String qcontM = "y";
								q.setPrompt();
								while(qcontM.equals("y")){
									q.setOption();
									if(test.isATest==true){
										String qcont1 = "y";
										answerSheet.addCorrectAnswer("");
										q.hasCorrectBeenSet=true;
									}
									System.out.println("Would you like to add another option?(y/n)");
									Scanner scan1 = new Scanner(System.in);
									qcontM = scan1.nextLine();
								}
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
			//print out the test/survey
			
			//end of while
		}		
		
	}
}
