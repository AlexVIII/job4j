package ru.job4j.client;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        Bank bank = new Bank();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        Bank bank = new Bank();
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), new Account("5546", 150));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        Bank bank = new Bank();
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), new Account("5546", 150));
        bank.addAccountToUser(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(250));
    }
}