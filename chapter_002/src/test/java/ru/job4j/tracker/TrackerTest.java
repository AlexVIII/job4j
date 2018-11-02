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
    assertThat(tracker.findAll()[0],is(item));
    }
}

