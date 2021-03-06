package ru.job4j.comparable;

/**
 * @author Igor Belogolovsky (igor@belogolovsky.net)
 * @version $Id$
 * @since 0.1
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User other) {
        return Integer.compare(this.age, other.getAge());
    }
}
