package ru.job4j.tracker;

import ru.job4j.start.Input;

public class FindItemsByName implements UserAction {
    private String nm;
    private int key;

    public FindItemsByName(int key,String nm){
        this.nm = nm;
        this.key = key;
    }
    @Override
    public int key() {
        return key;
    }


    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find Items by name--------------");
        String name = input.ask("Please, provide item name:");
        Item[] items = tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Items with this name not found");
        } else {
            for (Item item : items) {
                System.out.println(item);

            }
        }
    }

        @Override
        public String info () {
            return String.format("%d, %s", key, nm);
        }
    }
