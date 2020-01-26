package ru.job4j.client;



import java.util.*;




public class Bank {

    private Map<User, List<Account>> users = new HashMap<>();

    /*Add User*/
    public void addUser(User user) {
        this.users.put(user, null);
    }

    /*Add account for User*/
    public void addAccountToUser(String passport, Account account) {
        for (User index : users.keySet()) {
            if (index.getPassport().equals(passport)) {
                this.users.get(index).add(account);
            }
        }
    }



    /*Delete account from User*/
    public void deleteAccountFromUser(String passport, Account account) {


        for (User index : users.keySet()) {
            if (index.getPassport().equals(passport)) {
                this.users.get(index).remove(account);
            }
        }
    }


    /*Delete User*/
    public void deleteUser(User user) {
        this.users.remove(user);

    }


    /*Get all users Accounts*/
    public List<Account> getUserAccounts (String passport) {

        List<Account> list = new ArrayList<>();
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                list = this.users.get(key);
            }
    }
        return list;
    }


    /*transfer money beetwen accounts*/

    public boolean transferMoney (String srcPassport, String srcRequisite,
                                  String dstPassport, String dstRequisite,
                                  double amount) {
        boolean result = false;
        Account src = this.findAccount(srcPassport, srcRequisite);
        Account dst = this.findAccount(dstPassport, dstRequisite);
        if (src != null && dst != null) {
            src.subtractAndAddMoney(amount, dst);
            result = true;
        }
        return result;
    }

    /*Find requisite*/
    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = this.findByPassport(passport);
        if (user != null) {
            int index = this.users.get(user).indexOf(new Account(requisite));
            if (index > -1) {
                result = this.users.get(user).get(index);
            }
        }
        return result;
    }


    /*Find passport*/

    public User findByPassport(String passport) {
        User result = null;
        for (User u : this.users.keySet()) {
            if (u.getPassport().equals(passport)) {
                result = u;
                break;
            }
        }
        return result;
    }


    /*Get by Passport*/
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


    /*Find Account*/
    private Account findAccount(String passport, String requisites) {
        Account result = null;
        User user = this.findByPassport(passport);
        if (user != null) {
            int index = this.users.get(user).indexOf(new Account(requisites));
            if (index > -1) {
                result = this.users.get(user).get(index);
            }
        }
        return result;
    }

}


