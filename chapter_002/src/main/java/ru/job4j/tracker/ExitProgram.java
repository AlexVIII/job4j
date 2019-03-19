package ru.job4j.tracker;

import ru.job4j.start.Input;

public class ExitProgram extends BaseAction {
    private String nm;
    private int key;

    public ExitProgram(int key, String nm) {
        super(key, nm);
        //    this.nm = nm;
        //   this.key = key;
    }
    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Exit program --------------");
            }

    @Override
    public String info() {
        return String.format("%d, %s", key, nm);
    }
}
