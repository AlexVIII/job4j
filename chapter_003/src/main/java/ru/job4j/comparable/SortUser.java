package ru.job4j.comparable;

import java.util.*;

/**
 * @author Igor Belogolovsky (igor@belogolovsky.net)
 * @version $Id$
 * @since 0.1
 */
public class SortUser {
    public Set<User> sort(List<User> users) {
        return new TreeSet<User>(users);
    }
    public void sortNameLength(List<User> users) {
        users.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return Integer.compare(o1.getName().length(), o2.getName().length());
                    }
                }
        );
    }

    public void sortByAllFields(List<User> users) {
        users.sort(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        final int rsl = o1.getName().compareTo(o2.getName());
                        return rsl != 0 ? rsl : Integer.compare(o1.getAge(), o2.getAge());
                    }
                }
        );
    }
}
