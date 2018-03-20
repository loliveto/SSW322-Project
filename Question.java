package M2;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Question {

	public String questionPrompt = new  String();
	public abstract void setOption();
	
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
