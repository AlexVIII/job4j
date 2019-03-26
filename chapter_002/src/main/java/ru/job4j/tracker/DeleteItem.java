package ru.job4j.tracker;

import ru.job4j.start.Input;

public class DeleteItem extends BaseAction {
    private String nm;
    private int key;

    public DeleteItem(int key, String nm) {
      super(key, nm);
        //  this.nm = nm;
       // this.key = key;
    }
    @Override
    public int key() {
        return key;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Delete item --------------");
        String name = input.ask("Please, provide item name:");
        if (tracker.delete(name)) {
            System.out.println("Item id = " + name + " deleted or missing");
        } else {
            System.out.println("Item id = " + name + " not found");
        }
    }

  /*  @Override
    public String info() {
        return String.format("%d, %s", key, nm);
    }
    */
}
