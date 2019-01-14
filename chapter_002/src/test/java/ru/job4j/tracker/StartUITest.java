package ru.job4j.tracker;

import org.junit.Test;
import ru.job4j.start.Input;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput (new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }

    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc"));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }


    @Test
    public void whenFindById (){
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "123L");
        tracker.add(item);
        String id = item.getId();
        assertThat(tracker.findById(id), is(item));
    }
    @Test
    public void whenIFindItemByName() {
        Tracker tracker = new Tracker();
        Item[] item  = new Item[3];
        item[0] = new Item("Test", "TestDescription1", "123");
        item[1] = new Item("Test1", "TestDescription2", "1234");
        item[2] = new Item("Test2", "TestDescription3", "12345");
        tracker.add(item[0]);
        tracker.add(item[1]);
        tracker.add(item[2]);
        Item[] items = new Item[2];
        items[0] = item[0];
     //   items[1] = item[1];
        assertThat(tracker.findByName("Test"), is(items));
    }

}
