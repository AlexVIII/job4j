package ru.job4j.client;

public class User {
    public String name = "1"  ;
    public String passport ;



        public User(){}

        public void Hello (String name, String passport) {
            System.out.println("Клиент " + name + " паспорт " + passport);
        }

}

