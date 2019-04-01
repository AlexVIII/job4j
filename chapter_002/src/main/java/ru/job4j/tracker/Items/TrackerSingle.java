package ru.job4j.tracker.Items;

import ru.job4j.tracker.Item;

public enum TrackerSingle {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item name) {
        return name;
    }
}

