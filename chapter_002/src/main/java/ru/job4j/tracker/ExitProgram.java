package ru.job4j.tracker;

public class ExitProgram implements UserAction {
    @Override
    public int key() {
        return ADD;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Exit program --------------");
            }

    @Override
    public String info() {
        return "Exit program";
    }
}
