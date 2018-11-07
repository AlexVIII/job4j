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
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription", "123L");
        Item item2 = new Item("test2", "testDescription2", "1234L");
        tracker.add(item1);
        tracker.add(item2);
        String id = item1.getId();
        assertThat(tracker.findById(id), is(item1));
    }


   @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item old = new Item("Test", "TestDescription", "123l");
        tracker.add(old);
        Item fresh = new Item("TestNew", "TestDescriptionNew", "123lnew");
        fresh.setId(old.getId());
        tracker.replace(old.getId(),fresh);
        assertThat(tracker.findById(fresh.getId()), is("1231"))

    }


    @Test
    public void whenIFindItemByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test", "TestDescription", "123L");
        Item item2 = new Item("Test2", "TestDescription1", "123L1");
        Item item3 = new Item("Test", "TestDescription2", "123L2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] items = new Item[2];
        items[0] = item1;
        items[1] = item3;
        assertThat(tracker.findByName("Test"), is(items));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item ("Test1", "TestDescription1", "1234L");
        Item item2 = new Item ("Test2", "TestDescription2", "12345L");
        Item item3 = new Item("Test3", "TestDescription3", "123456L");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] items = new Item[3];
        items[0] = item1;
        items[1] = item2;
        items[2] = item3;
        tracker.delete("123456L");
        assertThat(tracker.findAll().length, is(2));
    }
}

