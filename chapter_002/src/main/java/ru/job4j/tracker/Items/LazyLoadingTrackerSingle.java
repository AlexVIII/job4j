import ru.job4j.tracker.Items;

public class LazyLoadingTrackerSingle {
    private static LazyLoadingTrackerSingle instance;
    
    private LazyLoadingTrackerSingle() {
    }
    
    public static LazyLoadingTrackerSingle getInstance() {
        if (instance == null) {
            instance = new LazyLoadingTrackerSingle();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}