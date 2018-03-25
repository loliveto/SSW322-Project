package M2;

import java.util.ArrayList;

public class OpenEnded extends Question{

	int charLimit;
	
	String questionPrompt = new String();
	
	
	//Initializes the Open Ended question and sets character limit
	public OpenEnded(String s){
		if(s.equals("long")){
			charLimit = 2000;
		}
		if(s.equals("short")){
			charLimit = 250;
		}
	}

	@Override
	public void setOption() {
		
	}

	@Override
	public String getOption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> getAllOptions() {
		// TODO Auto-generated method stub
		return null;
	}
}
