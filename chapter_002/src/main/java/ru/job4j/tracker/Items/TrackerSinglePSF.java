package ru.job4j.tracker.items;

import ru.job4j.tracker.Item;


public class TrackerSinglePSF {
    private static TrackerSinglePSF instance;
    
    private TrackerSinglePSF() {
    }
    
    public static TrackerSinglePSF getInstance() {
        if (instance == null) {
            instance = new TrackerSinglePSF();
        }
        return instance;
    }

    public Item add(Item name) {
        return name;
    }
}