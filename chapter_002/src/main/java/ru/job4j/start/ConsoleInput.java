package ru.job4j.start;


import ru.job4j.tracker.MenuOutException;

import java.util.*;

public  class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return  scanner.nextLine();

    }
    public  int ask(String question, List<Integer>range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for  (int value :range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
			if (!exist){
				throw new MenuOutException("out of menu range");
			}
			return key;
		/*
		if (exist) {
            return key;
        } else {
            throw new MenuOutException("out of menu range");
        }
*/
    }
	
}

