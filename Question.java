package M2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {

	public String questionPrompt = new  String();
	boolean hasCorrectBeenSet = false;
	public abstract void setOption();
	public abstract String getOption();
	public abstract void getAllOptions();
	
	//Gets the options
	public String getPrompt(){
		return this.questionPrompt;
	}
		
	//Sets the options
	public void setPrompt(){
		System.out.println("What would you like your question to be?");
		Scanner question = new Scanner(System.in);
		String s = question.nextLine();
		this.questionPrompt = s;
	}
	
}
