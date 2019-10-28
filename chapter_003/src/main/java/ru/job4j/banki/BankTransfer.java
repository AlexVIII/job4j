package ru.job4j.banki;

public class BankTransfer {


    public void addUser(User user) {} - добавление пользователя.

    public void deleteUser(User user) {} - удаление пользователя.

    public void addAccountToUser(String passport, Account account) {} - добавить счёт пользователю.

    public void deleteAccountFromUser(String passport, Account account) {} - удалить один счёт пользователя.

    public List<Accounts> getUserAccounts (String passport) {} - получить список счетов для пользователя.
}
