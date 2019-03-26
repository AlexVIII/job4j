package ru.job4j.tracker.Items;

public class EagerLoadingTrackerSingle {
    INSTANCE; // здесь мы указываем перечисления.

    // Конструкторы и методы.
    public Item add(Item model) {
        return model;
    }
}

