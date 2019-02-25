package ru.job4j.tracker;

import ru.job4j.start.Input;

public class UpdateItem implements UserAction {
    private String nm;
    private int key;

    public UpdateItem(int key,String nm){
        this.nm = nm;
        this.key = key;
    }
    @Override
    public int key() {
        return key;
    }


    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Edit item --------------");
        String name = input.ask("Please, provide item name:");
        String desc = input.ask("Please, provide item description:");
        Item item = new Item(name, desc);
        if (this.tracker.replace(id, items)) {
            System.out.println("Item id = " + id + " change");
        } else {
            System.out.println("Item id = " + id + " is missing");

        }
    }

    @Override
    public String info() {
        return String.format("%d, %s", key, nm);
    }
}

