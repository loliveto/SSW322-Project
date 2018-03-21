package M2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ranking extends Question {

	ArrayList<String[]> options = new ArrayList<String[]>();
	
	String rank;
	
	String questionPrompt = new String();
	
	public ArrayList<String[]> getOptions(){
		return options;
	}
	
	
	@Override
	public void setOption() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Enter the first item to rank: ");
		Scanner contInput = new Scanner(System.in);
		String s = contInput.nextLine();
		
		System.out.println("Enter the rank value of that item: ");
		Scanner contInput2 = new Scanner(System.in);
		rank = contInput.nextLine();
		
		String[] pair = new String[2];
		
		pair[0] = s;
		pair[1] = rank;
		
		this.options.add(pair);

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

