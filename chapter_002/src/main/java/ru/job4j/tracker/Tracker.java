package ru.job4j.tracker;
import java.util.*;

 /**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */

    private final Item[] items = new Item[100];
    private static final  Random RN = new Random();
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
      //  item.setId(this.generateId());
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
        return String.valueOf(RN.nextInt());
    }

     /** редактирование заявок
      * @param id
      * @param item
      */
    public void replace(String id, Item item) {

        return ;
     }

     /**удаление заявок
      *
      * @param id
      */
     public void delete(String id) {
        Item[] result = null;
         for (int index = 0; index != this.position; index++) {
             if (items[this.id()].equals(id))
                 break;
         }
     }

     /**получение списка всех заявок
      *
      * @return
      */
     public Item[] findAll() {
         Item[] result = new Item[this.position];
         for (int index = 0; index != this.position; index++) {
             result[index] = this.items[index];
         }
         return items;
     }

     /**
      * получение списка по имени
      * @param key
      * @return
      */
     public Item[] findByName(String key) {
         Item[] result = null;
         for (int index = 0; index != this.position; index++) {
             if (items[index].getName().equals(key))
                 result [index] = this.items[index];
                 break;
         }
         return result;
     }

     /**получение заявки по id
      *
      * @param id
      * @return
      */
     protected findById(String id) {
        Item result = null;
         for (int index = 0; index != this.position; index++) {
             if (items[index].getId().equals(id)) {
                 result = items[index];
                 break;
             }
         }
         return result;
     }
}
