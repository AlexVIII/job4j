package ru.job4j.tracker;

import ru.job4j.start.Input;

public class ShowItems implements UserAction {
    private String nm;
    private int key;

    public ShowItems(int key,String nm){
        this.nm = nm;
        this.key = key;
    }
    @Override
    public int key() {
        return key;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Show all items --------------");
        Item[] items = this.tracker.findAll();
        for (Item item :items) {
            System.out.println(item);
        }
    }

    @Override
    public String info() {
        return String.format("%d, %s", key, nm);
    }
}

