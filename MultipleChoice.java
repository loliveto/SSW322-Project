package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
	
	public ArrayList<String> options = new ArrayList<String>();
	
	public String questionPrompt = new  String();
	
	
	public void multipleChoice(){	
		
	}

	//Gets the options
	public ArrayList<String> getOptions(){
		return options;
	}
	
	//Sets the options
	public void setOption(){
		System.out.println("What would you like your option to be?");
		Scanner contInput = new Scanner(System.in);
		String s = contInput.nextLine();
		this.options.add(s);
	}
	
	
	
}
//