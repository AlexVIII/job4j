package ru.job4j.client;

public class Account {
    Integer value;
    String requisites;

    public Account(Integer value, String requisites) {
        this.value =value;
        this.requisites = requisites;
    }

    public Integer getValue() {
        return value;
    }

    public String getRequisites() {
        return requisites;

    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
