package ru.job4j.client;

public class User {
    public String name;
    public String passport ;

    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public User(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }



    public User(){}

        public void Hello (String name, String passport) {
            System.out.println("Клиент " + name + " паспорт " + passport);
        }

}

