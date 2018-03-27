package M2;

import java.util.ArrayList;

public class TrueFalse extends Question{

	public ArrayList<String> options = new ArrayList<String>();
	public String questionPrompt = new  String();

	@Override
	public void setOption() {
		options.add("True");
		options.add("False");
	}

	@Override
	public String getOption() {
		return null;
	}

	@Override
	public void getAllOptions() {
		for(String op: options) {
			System.out.println("\t" + op);
		}
	}
 
}
