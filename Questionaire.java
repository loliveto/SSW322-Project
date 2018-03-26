package M2;

import java.util.ArrayList;

public class Questionaire {
	
	boolean isATest;
	ArrayList<Question> questionsList = new ArrayList<Question>();
	AnswerSheet ansSheet = new AnswerSheet();
	int id;
	String name;
	
	public Questionaire(){
		
	}

	public void setIsATest(boolean isATest) {
		this.isATest = isATest;
	}
	
	public boolean getIsATest() {
		return this.isATest;
	}

	public ArrayList<Question> getQuestionsList() {
		return questionsList;
	}

	public void addQuestion(Question q) {
		this.questionsList.add(q);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void tabulateSurvey() {
		//todo
	}
	
	public void gradeTest() {
		//todo
	}
	
	public void addAnswer(String ans) {
		ansSheet.addCorrectAnswer(ans);
	}
	
	public AnswerSheet getAnswerSheet() {
		return ansSheet;
	}
	
	
	
}

