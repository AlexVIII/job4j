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
    private int position;

    /**
     * Метод реализаущий добавление заявки в хранилище
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
     * @return Уникальный ключ.
     */
    private String generateId() {
        return new StringBuilder().append(LocalTime.now()).append(Math.random() * 1000).toString();
    }


    /**
     * Метод выводит массив без нулевых значений
     * @return
     */

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**редактирование заявок
     *
     * @param id
     * @param item
     */
    public void replace(String id, Item item) {

    }

    /**удаление заявок
     *
     * @param id
     */
    public void delete(String id) {
        return this.items.splice(id, 1)
    }

    /**получение списка всех заявок
     *
     * @return
     */
    public Item[] findAll() {

        return Arrays.copyOf(this.items, this.position);
    }

    /**получение списка по имени
     *
     * @param key
     * @return
     */
    public Item[] findByName(String key) {
        Item result = null;
        for (int i = 0; i < this.position; this.position++) {
            if (this.items[i] != null && this.items.getName().equals(key)) {
                result = this.items[i];
                break;
            }

        }
        return result;
    }

    /**получение заявки по id
     *
      * @param id
     * @return
     */
    public Item findById(String id) {

    }


}