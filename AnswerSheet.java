package M2;

import java.util.ArrayList;
import java.util.HashMap;

public class AnswerSheet {

	public ArrayList<String> correctAnswers = new ArrayList<String>();
	public HashMap<Integer, ArrayList<String>> userAnswers = new  HashMap<Integer, ArrayList<String>>();
	//public Questionaire questionaire = new Questionaire();
	public int id;
	
	public AnswerSheet(int id) {
		//this.questionaire = questionaire;
		this.id = id;
	}
	
	public void addCorrectAnswer(String answer) {
		correctAnswers.add(answer);
	}
	
	public void addUserAnswer(Integer id, String answer) {
		ArrayList<String> ans = new ArrayList<String>();
		if(userAnswers.containsKey(id)) {
			ans = userAnswers.get(id);
			ans.add(answer);
			userAnswers.put(id, ans);
		}else{
			ans.add(answer);
			userAnswers.put(id, ans);
		}
	}
	
	public void checkAnswers(Integer id) {
		ArrayList<String> uAns = userAnswers.get(id);
		
		//finish!!!
		
	}
	
	public ArrayList<String> getCorrectAnswers() {
		return correctAnswers;
	}
	
	public ArrayList<String> getUserAnswers(Integer id) {
		return userAnswers.get(id);
	}
	
}
