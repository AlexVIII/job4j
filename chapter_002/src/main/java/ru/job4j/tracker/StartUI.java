package ru.job4j.tracker;

import ru.job4j.start.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    private static final String SHOW = "1";
    private static final String EDIT = "2";
    private static final String DELL = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
  /*  public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            //добавление заявки вынесено в отдельный метод.
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                //показать все заявки
                this.showAllItems();
            } else if (EDIT.equals(answer)) {
            //отредактировать заявку
                this.editItem();
            } else if (DELL.equals(answer)) {
                //удалить заявку
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                //найти заявку по id
                this.findItemId();
            } else if (FINDNAME.equals(answer)) {
                //найти заявку по имени
                this.findItemName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
*/

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("- Добавление новой заявки ---");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("- Новая заявка с getId : " + item.getId() + "");
    }

    private void showAllItems() {
        System.out.println("Полный список заявок-");
        Item[] items = this.tracker.findAll();
        for (Item item : items) {
            System.out.println(item);
        }

    }

    private void editItem() {
        System.out.println("Редактирование заявки-");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item items = new Item(name, desc);
        if (this.tracker.replace(id, items)) {
            System.out.println("Заявка id = " + id + " изменена");
        } else {
            System.out.println("Заявка id = " + id + " отсутствует");
        }
    }


    private void deleteItem() {
        System.out.println("Удаление заявки-");
        String name = this.input.ask("Введите ID заявки :");
        if (this.tracker.delete(name)) {
            System.out.println("Заявка id = " + name + " удалена или отсутствует");
        } else {
            System.out.println("Заявка id = " + name + " не найдена");
        }
    }


    private void findItemId() {
        System.out.println("Поиск заявки по номеру ID");
        System.out.println("Введите ID заявки :");
        String id = this.input.ask("Введите ID заявки :");

        Item items = this.tracker.findById(id);
        if (items != null) {
            System.out.println("-------------Заявка id = " + id + "----------------");
        } else if (items == null) {
            System.out.println("-------------Заявка id = " + id + " не найдена ----------------");
        }

    }

    private void findItemName() {
        System.out.println("Поиск заявки по названию-");
        System.out.println("Введите название заявки:");
        String name = this.input.ask("Введите название заявки :");
        Item[] items = this.tracker.findByName(name);
        if (items.length == 0) {
            System.out.println("Заявки с таким именем не найдены");
        } else {
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    private void showMenu() {
        System.out.println("Меню.");

        // добавить остальные пункты меню.
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     *
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(), new Tracker()).init();

    }
  /*  public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        do {
            menu.show();
            menu.select(Integer.valueOf(input.ask("select:")));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }
    */

    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        List<Integer> range = new ArrayList<>();
        menu.fillActions();
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("select:", range));
        } while (!"y".equals(this.input.ask("Exit?(y): ")));
    }
}