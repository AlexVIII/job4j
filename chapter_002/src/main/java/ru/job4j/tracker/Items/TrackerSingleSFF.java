package ru.job4j.tracker.items;

import ru.job4j.tracker.Item;

public class TrackerSingleSFF {
    private static final TrackerSingleSFF INSTANCE = new TrackerSingleSFF();

    private TrackerSingleSFF() {
    }

    public static TrackerSingleSFF getInstance() {
        return INSTANCE;
    }

    public Item add(Item name) {
        return name;
    }

    public static void main(String[] args) {
        TrackerSingleSFF tracker = TrackerSingleSFF.getInstance();
    }
}
