package ru.job4j.tracker.Items;
import ru.job4j.tracker.Item;

public class TrackerSinglePSFF {
    private TrackerSinglePSFF() {
    }

    public static TrackerSinglePSFF getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSinglePSFF INSTANCE = new TrackerSinglePSFF();
    }

    public static void main(String[] args) {
        TrackerSinglePSFF tracker = TrackerSinglePSFF.getInstance();
    }
}
