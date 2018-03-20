package M2;

import java.util.ArrayList;

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
	public void setOption(String s){
		options.add(s);
	}
	
	
	
}
//