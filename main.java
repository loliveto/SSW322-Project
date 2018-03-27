package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args){
		
		int menuChoice = -1;
		ArrayList<Questionaire> questionnaireList = new ArrayList<Questionaire>();
		
		System.out.println("The Questionnaire CLAN Presents: \n");
		System.out.println("Creat a Test or Survey! \n");
		
		//while loop for entire program
		while(true){
			System.out.println("Press 1 to Create a Test\nPress 2 to Create a Survey\nPress 3 to Take a Test\nPress 4 to View Your Tests/Surveys\nPress 0 to quit");
			
			Scanner choiceInput = new Scanner(System.in);
			menuChoice = Integer.parseInt(choiceInput.nextLine());
			
			//while loop to iterate through the choices
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
												test.addAnswer(q.getOption());
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
									test.addAnswer("True");
								}else if(tf.equals("f")){
									test.addAnswer("False");
								}
								break;
								
							case 3:
								q = new OpenEnded("s");
								q.setPrompt();
								test.addAnswer("");
								break;
								
							case 4:
								q = new OpenEnded("l");
								q.setPrompt();
								test.addAnswer("");
								break;
								
							case 5:
								q = new Ranking();
								String qcontR = "y";
								q.setPrompt();
								while(qcontR.equals("y")){
									q.setOption();
									if(test.isATest==true){
										String qcont1 = "y";
										test.addAnswer("");
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
										test.addAnswer("");
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
					
					ArrayList<Question> output = test.getQuestionsList();
					//print our the test
					System.out.println(test.getName());
					int qNum = 1;
					ArrayList<String> as = test.getAnswerSheet().getCorrectAnswers();
					for(Question qs: output) {
						System.out.println(qNum + ") " + qs.getPrompt());
						qs.getAllOptions();
						System.out.println("Correct Answer: " + as.get(qNum-1));
						qNum++;
						
					}
					break;
					
				case 2:
					//code to create Survey
					Questionaire survey = new Questionaire();
					questionnaireList.add(survey);
					
					//name survey
					System.out.println("What would you like to name your survey?");
					Scanner nameInputS = new Scanner(System.in);
					survey.name = nameInputS.nextLine();
					
					//set istest to false
					survey.isATest = false;
					
					//ask type of question (keep asking until done)
					System.out.println("Now you can add questions to your survey.");
					String contS = "y";
					
					//adding questions
					while(contS.equals("y")){
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
								q.setPrompt();
								q.setOption();
								break;
								
							case 3:
								q = new OpenEnded("s");
								q.setPrompt();
								break;
								
							case 4:
								q = new OpenEnded("l");
								q.setPrompt();
								break;
								
							case 5:
								q = new Ranking();
								String qcontR = "y";
								q.setPrompt();
								while(qcontR.equals("y")){
									q.setOption();
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
									System.out.println("Would you like to add another option?(y/n)");
									Scanner scan1 = new Scanner(System.in);
									qcontM = scan1.nextLine();
								}
								break;
						}
						//adds question to questionlist
						survey.addQuestion(q);
						
						System.out.println("Would you like to add another question? (y/n)");
						Scanner contInput = new Scanner(System.in);
						contS = contInput.nextLine();
					}
					
					System.out.println("\n-----------------------------------------------\n");
					System.out.println("Here is your test:");
					
					//output
					ArrayList<Question> outputS = survey.getQuestionsList();
					System.out.println(survey.getName());
					int qNumS = 1;
					for(Question qs: outputS) {
						System.out.println(qNumS + ") " + qs.getPrompt());
						qs.getAllOptions();
						qNumS++;
					}
					System.out.println("\n");
					break;
					
				case 3:
					break;
					
				case 4:
					//code to view test/survey
					//list all 
					break;
					
				default:
					System.exit(1);
					break;
					
				//end of switch
			}
			
			//end of while
		}		
		
	}
}
