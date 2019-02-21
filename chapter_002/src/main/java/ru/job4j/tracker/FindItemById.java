package ru.job4j.tracker;

public class FindItemById implements UserAction {
    @Override
    public int key() {
        return ADD;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find item by id --------------");
        String name = input.ask("Please, provide item name:");
        Item items = this.tracker.findById(id);
        if (items != null) {
            System.out.println("-------------Item id = " + id + "----------------");
        } else if (items == null) {
            System.out.println("-------------Заявка Description : " + item.getDesc());
        }
    }

        @Override
        public String info () {
            return "Find item by Id";
        }
    }


