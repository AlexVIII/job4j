package ru.job4j.client;

public class Client {
    private String name;
    private String passport;
    private String key;


    public Client(String key, String name){
        this.name = name;
        this.key = key;

    }
    public String addUser(){
        return name;
    }

    public String addAccountToUser(){
        return passport;
    }
}
