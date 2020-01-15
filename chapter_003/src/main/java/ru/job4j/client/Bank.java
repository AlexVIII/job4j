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
    accounts.remove(account);
    }

    public List<Account> getUserAccounts (String passport) {
        List<Account> accounts = users.get(getUserByPassport(passport));
        accounts.contains(passport);


        return null;
    }





    public boolean transferMoney (String srcPassport, String srcRequisite,
                                  String destPassport, String dstRequisite,
                                  double amount) {
        boolean result;
        double count;





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
/*
package ru.job4j.bank;

        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {

    }

    public void addAccount(String passport, Account account) {

    }

    public User findByPassport(String passport) {
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;
        return rsl;
    }
}