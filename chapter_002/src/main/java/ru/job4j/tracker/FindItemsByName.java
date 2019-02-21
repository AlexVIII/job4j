package ru.job4j.tracker;

public class FindItemsByName implements UserAction {
    @Override
    public int key() {
        return ADD;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find Items by name--------------");
        String name = input.ask("Please, provide item name:");
        Item[] items = this.tracker.findByName(name);
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
            return "Find items by name";
        }
    }
