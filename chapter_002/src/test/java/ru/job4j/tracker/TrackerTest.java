package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {

    @Test
    public void whenAddNewItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Test", "TestDescription", "123L");
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item old = new Item("Test", "TestDescription", "123l");
        tracker.add(old);
        Item fresh = new Item("TestNew", "TestDescriptionNew", "123lnew");
        setId(old.getId());
        assertThat(tracker.findAll()[0], is(fresh))

    }
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item[0] = new Item("Test", "TestDescription", "123L");
        Item item[1] = new Item("Test1", "TestDescription1", "123L1");
        Item item[2] = new Item("Test2", "TestDescription2", "123L2");
        tracker.add(item);
        String item.getId();
        tracker.delete(id);
        assertThat(tracker.findAll(); is(item));
    }

    @Test
    public void whenFindItemByName() {
        Tracker tracker = new Tracker;
        Item item[0] = new Item("Test", "TestDescription", "123L");
        Item item[1] = new Item("Test1", "TestDescription1", "123L1");
        Item item[2] = new Item("Test2", "TestDescription2", "123L2");
        tracker.add(item);
        String item.getName();
        tracker.findByName(key);
        assertThat(tracker.findAll()[2], is("Test2"));

    }
}

