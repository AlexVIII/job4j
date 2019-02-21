package ru.job4j.tracker;

public class UpdateItem implements UserAction {
    @Override
    public int key() {
        return ADD;
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
        return "Update Item.";
    }
}

