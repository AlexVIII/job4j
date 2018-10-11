package ru.job4j.tracker;
import java.util.Random;

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
        String codeId;
        Random random = new Random();
        codeId = random.toString();
       //Реализовать метод генерации.
        return codeId;
    }
     public void replace(String id, Item item) {
        for (i)
     }

}


Мето/* public void replace(String id, Item item) должен заменить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id
        3. Метод public void delete(String id) должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.  Далее сместить все значения справа от удаляемого элемента - на одну ячейку влево с помощью System.arrayCopy();
        4. Метод public Item[] findAll() возвращает копию массива this.items без null элементов;
        5. Метод public Item[] findByName(String key) проверяет в цикле все элементы массива this.items, сравнивая name (используя метод getName класса Item) с аргументом метода String key. Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
        6. Метод public Item findById(String id) проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id и возвращает найденный Item. Если Item не найден - возвращает null.