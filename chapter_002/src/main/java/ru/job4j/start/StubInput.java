package ru.job4j.start;

public class StubInput implements Input {

	private  String[] answers;
	private  int position = 0;

	public StubInput (String[] answers) {
		this.answers = answers;
	}
//	String ask(String question);
// return

	public String getAnswers() {
		return answers[position++];
	}
	@Override
	public String ask (String question) {
		return  null;
	}
}