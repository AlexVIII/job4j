package ru.job4j.sort;

import java.util.TreeSet;
import java.util.List;
import java.util.Set;


class SortUser {
    public Set<User> sort(List<User> list) {
        return new TreeSet<User>(list);
    }
}
