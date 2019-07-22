package ru.job4j.tracker;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {

    /**
     * Массив для хранение заявок.
     */
  //  private final Item[] items = new Item[100]; замена на метод Array
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        // this.items[this.position++] = item; замена на метод Array
        this.items.add(item);
        this.position++;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        return new StringBuilder().append(LocalTime.now()).append(Math.random() * 1000).toString();
    }


    /**
     * Метод выводит массив без нулевых значений
     *
     * @return
     */

    public List<Item> findAll() {
        List<Item> result = new ArrayList<>(this.items);
        return result;
    }

 /*   /**
    * редактирование заявок
    *
    * @param id
    * @param item
    */
    public boolean replace(String id, Item item) {
        boolean exit =  false;
        for (int i = 0; i < this.position; i++) {
            if (items != null && item.getId().equals(id)) {

                this.items.set(i, item);
                this.items.get(i).setId(id);
                exit = true;
                break;
            }

        }
    return exit;
}


    /**
     * удаление заявок
     *
     * @param id
     */
    public boolean delete(String id) {
            boolean exit =  true;
        for (int i = 0; i < this.position; i++) {
        //    if (items == null) {
         //       exit = false;
         //   } else if (items != null && item.getId().equals(id)) {
            if (items != null && items.get(i).getId().equals(id)) {
                this.items.remove(i);
               /* System.arraycopy(items, i + 1, items, i, this.position - i);
                this.position = this.position - 1;
                exit = true;
                */
                this.position --;
            }
        }
        return exit;

    }


    /**
     * получение списка по имени
     *
     * @param key
     * @return
     */

    public Item[] findByName(String key) {
        Item[] found = new Item[this.position];
        int counter = 0;
        for (int i = 0; i < this.position; i++) {
            if (items != null && this.items.get(i).getName().contains(key)) {
                found[counter++] = this.items.get(i);
            }
        }
        return Arrays.copyOf(found, counter);
    }

    /**
     * получение заявки по id
     *
     * @param id
     * @return
     */
     public Item findById(String id) {
        Item result = null;
        for (Item item : this.items) {
            if (items != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }



}
