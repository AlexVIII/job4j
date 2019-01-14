package ru.job4j.tracker;

import ru.job4j.start.Input;

public class StubInput implements Input {

	private  String[] answers;
	private  int position = 0;

	public StubInput(String[] answers) {
		this.answers = answers;
	}

	public String getAnswers() {
		return answers[position++];
	}
	@Override
	public String ask(String question) {
		return  answers[position++];
	}
}