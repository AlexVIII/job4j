package ru.job4j.tracker;

import ru.job4j.start.Input;

public class FindItemById extends BaseAction {
    private String nm;
    private int key;

    public FindItemById(int key, String nm) {
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
        System.out.println("------------ Find item by id --------------");
        String id = input.ask("Please, provide item ID :");
        Item items = tracker.findById(id);
        if (items != null) {
            System.out.println("-------------Item ID = " + id + "----------------");
        } else  {
            System.out.println("-------------Item not found ---------------");
        }
    }
/*
        @Override
        public String info() {
            return String.format("%d, %s", key, nm);
        }
        */
    }


