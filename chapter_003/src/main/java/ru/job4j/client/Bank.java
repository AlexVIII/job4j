package ru.job4j.client;




import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Bank {

    public static void main(String[] args) {



        Map <User, List <Account>> money = new HashMap <>();


    }


// Добвавление пользователя
    public void addUser(User user) {

       money.put(user, new ArrayList<Account>());

        }




    //  удаление пользователя
    public void deleteUser(User user) {
        money.remove(user);
    }

    //добавить счёт пользователю
    public void addAccountToUser(String passport, Account account) {


    }






    // удалить один счёт пользователя
    public void deleteAccountFromUser(String passport, Account account) {}

   // получить список счетов для пользователя
  /*  public List<Accounts> getUserAccounts (String passport) {

    }
    */
}
