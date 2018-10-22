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

     /** редактирование заявок
      * @param id
      * @param item
      */
    public void replace(String id, Item item) {
    for (Item item : items) {
        if (item.getId().equals(id)){
            item.name = "****"
        }
    }
    return System.array(this.items);


     /**удаление заявок
      *
      * @param id
      */
     public void delete(String id) {
         for (Item item : items) {
             if (item.getId().equals(id))
                 break;
             System.array(this.items,this.position);
        }


     /**получение списка всех заявок
      *
      * @return
      */
     public Item[] findAll() {
      return array.copyOf(this.items, this.position)
     }

     /**
      * получение списка по имени
      * @param key
      * @return
      */
     public Item[] findByName(String key) {
         for (Item item : items) {
             if (item.name.equals(key))
                 return array.copy(this.items, this.position)
         }
     }

     /**получение заявки по id
      *
      * @param id
      * @return
      */
     protected findById(String id) {
        Item result = null;
         for (Item item : items) {
             if (item != null && item.getId().equals(id)) {
                 result = item;
                 break;
             }
         }
         return result;
     }
}
