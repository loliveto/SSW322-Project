package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Question{
	
	public ArrayList<String> options = new ArrayList<String>();
	
	public String questionPrompt = new  String();
	
	
	public void multipleChoice(){	
		
	}

	//Gets the options
	public String getOption(){
		return options.get(options.size()-1);
	}
	
	//Sets the options
	public void setOption(){
		System.out.println("What would you like your option to be?");
		Scanner contInput = new Scanner(System.in);
		String s = contInput.nextLine();
		this.options.add(s);
	}

	@Override
	public void getAllOptions() {
		for(String op: options) {
			System.out.println("\t" + op);
		}
	}
	
	
	
}
//