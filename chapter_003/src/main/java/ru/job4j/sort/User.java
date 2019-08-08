package ru.job4j.sort;

class User implements Comparable<User> {

    private String name;
    private String city;
    public int age;

    public User(String name, int age) {
        this.name = name;
        //this.city = city;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }


    public String getName() {
        return this.name;
    }


        /*
        public String getCity() {
              return this.city;
        }
         */


    @Override
    public int compareTo(User user) {
        return Integer.compare(this.age, getAge());
    }
}



