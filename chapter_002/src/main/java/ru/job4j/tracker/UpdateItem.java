package ru.job4j.tracker;

import ru.job4j.start.Input;

public class UpdateItem extends BaseAction {
    private String nm;
    private int key;

    public UpdateItem(int key, String nm) {
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
        System.out.println("------------ Edit item --------------");
        String id = input.ask("Please, provide item ID :");
        String name = input.ask("Please, provide item Name:");
        String desc = input.ask("Please, provide item Description:");
        Item item = new Item(name, desc);
        if (tracker.replace(id, item)) {
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

