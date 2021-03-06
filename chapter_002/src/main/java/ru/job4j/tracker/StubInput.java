package ru.job4j.tracker;

import ru.job4j.start.Input;

import java.util.List;

public class StubInput implements Input {

	private  String[] answers;
	private  int position = 0;

	public StubInput(String[] answers) {
		this.answers = answers;
	}

	public String getAnswers() {
		return answers[position++];
	}

	public String ask(String question) {
		return  answers[position++];
	}



    public int ask(String question, List<Integer> range) {

        return Integer.valueOf(this.ask(question));
    }
}