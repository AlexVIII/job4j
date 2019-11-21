package ru.job4j.client;


import java.util.*;




public class Bank {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new LinkedList<>());
    }

    public void deleteUser(User user) {
        users.remove(user);

    }

    public void addAccountToUser(String passport, Account account) {
        User user = getUserByPassport(passport);
        if (user != null) {
            users.get(user).add(account);
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
    List<Account> accounts = users.get(getUserByPassport(passport));
    }

    public List<Account> getUserAccounts (String passport) {



      List<Account> sheet = null;

    for (List<Account> find : users.values()){
        for (Account u : find){
            if (users.get(passport))
        }
    }

        return null;
    }





    public boolean transferMoney (String srcPassport, String srcRequisite,
                                  String destPassport, String dstRequisite,
                                  double amount) {
        return false;
    }

    private User getUserByPassport(String passport) {
        User result = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
                break;
            }
        }
        return result;
    }


}