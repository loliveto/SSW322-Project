package M2;

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
}
