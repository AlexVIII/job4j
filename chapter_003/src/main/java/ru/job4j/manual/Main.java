package ru.job4j.manual;

public class Main {
    public static void main(String[] args) {
        try{
            throw  new MyException();
        }catch (MyException e){
            e.printStackTrace();
        }

    }
}
