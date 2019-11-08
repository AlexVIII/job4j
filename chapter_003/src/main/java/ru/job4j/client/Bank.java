package ru.job4j.client;

import ru.job4j.client.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Bank {

    public static void main(String[] args) {


     /* User clients = new User();
     System.out.println(clients.passport);
     */
        Map <User, List<Account>> account = new HashMap <>();


    }

    List<String> client = new ArrayList <>();
// Добвавление пользователя
    public void addUser(User user) {

        for (String person : client){
            client.add(person);

        }

    }




    //  удаление пользователя
    public void deleteUser(User user) {
        for (String person : client){
            client.remove(person);

        }
    }

    //добавить счёт пользователю
    public void addAccountToUser(String passport, Account account) {

        for ()


    }

    // удалить один счёт пользователя
    public void deleteAccountFromUser(String passport, Account account) {}

   // получить список счетов для пользователя
  /*  public List<Accounts> getUserAccounts (String passport) {

    }
    */
}
