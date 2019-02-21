package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public int key() {
        return ADD;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Delete item --------------");
        String name = input.ask("Please, provide item name:");
        if (this.tracker.delete(name)) {
            System.out.println("Item id = " + name + " deleted or missing");
        } else {
            System.out.println("Item id = " + name + " not found");
        }
    }

    @Override
    public String info() {
        return "Delete item.";
    }
}
