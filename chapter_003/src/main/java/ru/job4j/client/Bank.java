package ru.job4j.client;




import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Bank {

    HashMap map;
    User user;
    public static void main(String[] args) {



        Map <User, List <Account>> map = new HashMap <>();

        System.out.println(map.size());
    }


// Добвавление пользователя


    public void addUser(User user) {

     map.put(user, new ArrayList<Account>());
    }



    //  удаление пользователя
    public void deleteUser(User user) {
        map.remove(user);
    }

    //добавить счёт пользователю
    public void addAccountToUser(String passport, Account account) {
        List<Account> accounts = map.get(String passport);
        accounts.add(account);

    }






    // удалить один счёт пользователя
    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> accounts = map.get(String passport);
        accounts.remove(passport);
    }

   // получить список счетов для пользователя
   public List<Account> getUserAccounts (String passport) {
        user = null;
        User temp;
        for (User temp : map.keySet()){
            if (temp.getPassport().equals(passport)){
                user = temp;
                break;
            }


        }
return user;
    }

}
