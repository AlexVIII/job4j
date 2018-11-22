package ru.job4j.tracker;

import java.time.LocalTime;
import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
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
        this.items[this.position++] = item;
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

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

 /*   /**
    * редактирование заявок
    *
    * @param id
    * @param item
    */
    public void replace(String id, Item item) {
        for (int i = 0; i < this.position; i++){

            if (this.items[i] != null && this.items[i].getId().equals(id)){
                 item.setId(id);
                 this.items[i] = item;
                 break;
            }

        }

}


    /**
     * удаление заявок
     *
     * @param id
     */
    public void delete(String id) {

        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                System.arraycopy( items, i + 1 , items, i, this.position - i);
                this.position = this.position - 1;
                break;
            }
        }

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
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                found[counter++] = this.items[i];
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
        for (int i = 0; i < this.position; i++) {
            if (this.items[i] != null && this.items[i].getId().equals(id)) {
                result = this.items[i];
                break;
            }
        }
        return result;
    }

}
