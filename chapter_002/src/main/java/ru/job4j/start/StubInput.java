package ru.job4j.start;

public class StubInput implemets Input {

	private  String[] answers;
	private  int position = 0;

	public StubInput(String[] answers) {
		this.answers = answers;
	}
	String ask(String guestion);
	return

	public String[] getAnswers() {
		return answers[position++];
	}
}