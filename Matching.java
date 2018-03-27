package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Matching extends Question{

	ArrayList<String> options = new ArrayList<String>();
	
	String questionPrompt = new String();
	
	@Override
	public void setOption() {
		System.out.println("Enter the first item of a match: ");
		Scanner contInput = new Scanner(System.in);
		String s = contInput.nextLine();
		
		System.out.println("Enter the second item of a match: ");
		Scanner contInput2 = new Scanner(System.in);
		String s2 = contInput.nextLine();
		
		String pair = s + "\t" + s2;
				
		this.options.add(pair);
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
//