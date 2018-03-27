package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ranking extends Question {

	ArrayList<String> options = new ArrayList<String>();
	
	String rank;
	
	String questionPrompt = new String();
	
	@Override
	public void setOption() {
		System.out.println("Enter an item to rank: ");
		Scanner contInput = new Scanner(System.in);
		String s = contInput.nextLine();
		
		System.out.println("Enter the rank value of that item: ");
		Scanner contInput2 = new Scanner(System.in);
		rank = contInput.nextLine();
		
		String pair = s + "\t" + rank;
		
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

