package M2;

import java.util.ArrayList;

public class TrueFalse extends Question{

	public ArrayList<String> options = new ArrayList<String>();
	
	public String questionPrompt = new  String();
	
	//Initializes the options to True and False
	public void trueFalse(){	
		options.add("True");
		options.add("False");
	}

	@Override
	public void setOption() {
		// TODO Auto-generated method stub
		
	}
 
}
