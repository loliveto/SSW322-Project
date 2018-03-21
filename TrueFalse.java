package M2;

import java.util.ArrayList;

public class TrueFalse extends Question{

	public ArrayList<String> options = new ArrayList<String>();
	public String questionPrompt = new  String();

	@Override
	public void setOption() {
		// TODO Auto-generated method stub
		options.add("True");
		options.add("False");
	}

	@Override
	public String getOption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getAllOptions() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
