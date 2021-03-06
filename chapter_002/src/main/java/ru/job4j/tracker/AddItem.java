package ru.job4j.tracker;

import ru.job4j.start.Input;

public class AddItem extends BaseAction {
    private String nm;
    private int key;

    public AddItem(int key, String nm) {
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
        System.out.println("------------ Adding new item --------------");
        String name = input.ask("Please, provide item name:");
        String desc = input.ask("Please, provide item description:");
        Item item = new Item(name, desc);
        tracker.add(item);
        System.out.println("------------ New Item with Id : " + item.getId());
        System.out.println("------------ New Item with Name : " + item.getName());
        System.out.println("------------ New Item with Description : " + item.getDescription());
    }

   /* @Override
    public String info() {
    return String.format("%d, %s", key, nm);
    }
    */
}
