package ru.job4j.tracker;

public class ShowItems implements UserAction {
    @Override
    public int key() {
        return ADD;
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
        return "Show Items.";
    }
}

