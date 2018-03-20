package M2;

import java.util.ArrayList;

public abstract class Question {

	public String questionPrompt = new  String();
	public abstract void setOption();
	
	//Gets the options
	public String getPrompt(){
		return this.questionPrompt;
	}
		
	//Sets the options
	public void setPrompt(String s){
		this.questionPrompt = s;
	}
	
}
