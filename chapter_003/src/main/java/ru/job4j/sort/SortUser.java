package ru.job4j.sort;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;


class SortUser {
    public Set<User> sort(List<User> list) {
        return new TreeSet<User>(list);
    }

    public void  SortNameLength(List<User> users){
    users.sort(new Comparator<User>(){
    @Override
    public int compare(User o1, User o2){
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }

    }
    );
    }

    public void sortByAllFields (List<User> users){
        users.sort(new Comparator<User>(){
            @Override
            public int compare(User o1, User o2){
                int result = o1.getName().compareTo(o2.getName());
                return result != 0 ? result: Integer.compare(o1.getAge(), o2.getAge());
            }

        }
        );

    }

}
