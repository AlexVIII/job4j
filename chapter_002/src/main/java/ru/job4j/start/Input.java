package ru.job4j.start;

import java.util.List;

public interface Input {
	String ask(String guestion);
	int ask(String question, List<Integer> range);
}