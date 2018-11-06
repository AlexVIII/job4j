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
    public void whenFindItemByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test", "TestDescription", "123L");
        Item item2 = new Item("Test1", "TestDescription1", "123L1");
        //   Item item3 = new Item("Test2", "TestDescription2", "123L2");
        tracker.add(item1);
        tracker.add(item2);
        //   tracker.add(item3);
        Item[] items = new Item[2];
        items[0] = item1;
        items[1] = item2;
        //  items[2] = item3;
        assertThat(tracker.findByName("Test1"), is(items));


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

  /*  @Test
    public void whenFindByNameItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "123L");
        Item next = new Item("test1", "testDescription2", "1234L");
        Item next2 = new Item("test2", "testDescription3", "1224L");
        tracker.add(item);
        tracker.add(next);
        tracker.add(next2);
        Item[] items = new Item[2];
        items[0] = item;
        items[1] = next;
        assertThat(tracker.findByName("test1"), is(items));
    } */
  /*  @Test
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
*/
    @Test
    public void whenIFindItemByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("Test", "TestDescription", "123L");
        Item item2 = new Item("Test2", "TestDescription1", "123L1");
        Item item3 = new Item("Test", "TestDescription2", "123L2");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] items =new Item[2];
        items[0] = item1;
        items[1] = item3;
        assertThat(tracker.findByName("Test"), is(items));

    }
}

