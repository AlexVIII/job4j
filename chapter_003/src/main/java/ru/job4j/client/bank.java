package ru.job4j.client;

import com.sun.security.ntlm.Client;
import ru.job4j.list.User;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class bank {
    public static void main(String[] args) {


        Map <String, String> clients = new HashMap <>();

        public void addUser(Client client) {
            this.clients.put(ru.job4j.client.Client());
        }

//        /*добавление пользователя*/
 //       client.put("1", "Petrov");
  //      client.put("2", "Ivanov");
    //    client.put("3", "Sidorov");
     //   String b;
     //   client.computeIfAbsent("4", b - nameClient.nameClient());

        /*удаление пользователя*/

  //      client.remove("2");
        Set<Map.Entry<String, String>> sheet = clients.entrySet();
        for (Map.Entry<String, String> n : sheet){
            System.out.println(n.getKey() + n.getValue());
        }
    }
}


   /*     public void addUser (User user){
            Map<String, Integer> client = new HashMap<String, Integer>();
            client.put(addUser.name, addUser.passport);
        }
/*
        public void deleteUser(User user) {
            client.remove(name);


        }

   */
   /*public void addAccountToUser(String passport, Account account) {
       client.put

    } - добавить счёт пользователю.
        }

    public void deleteAccountFromUser(String passport, Account account) {} - удалить один счёт пользователя.

    public List<Accounts> getUserAccounts (String passport) {} - получить список счетов для пользователя.
    }
*/


