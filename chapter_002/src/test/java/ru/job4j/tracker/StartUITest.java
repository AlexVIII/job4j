package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.start.Input;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;


public class StartUITest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    private String ls = System.lineSeparator();
    private String menu = "Меню." + ls + "0. Add new Item" + ls + "1. Show all items" + ls +
            "2. Edit item" + ls + "3. Delete item" +ls + "4. Find item by Id" +ls +
            "5. Find items by name" +ls + "6. Exit Program" +ls;



    @Test
    public void findAllTracker() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(out.toString(), is(
                new StringBuilder().append(menu)
                        .append("- Добавление новой заявки ---").append(ls)
                        .append("- Новая заявка с getId :").append(tracker.findAll()[0].getId()).append(ls)
                       .append(menu)

        ));

    }

    @Test
    public void deleteItemId() {
    //создаем Tracker
    Tracker tracker = new Tracker();
    Item item = tracker.add(new Item("test name", "desc"));
    // создаю StubInput споследовательноятью действий (удаление заявки по номеру ID
    Input input = new StubInput(new String[]{"3", item.getId() , "6"});
    //создаю StartUI и вызываю метод unit()
        new StartUI(input, tracker).init();
    assertNull(out.toString(), is(
            new StringBuilder().append(menu)
            .append("Удалаение заявки-").append(ls)
                    .append("Введите ID заявки :").append(ls)
                    .append("Заявка id = ").append(tracker.findAll()[0].getName())
                    .append(" удалена или отсутствует")
            .append(menu)
            ));

}





    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
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
        assertThat(tracker.findAll()[0].getName(), is("test replace"));
    }

    @Test
    public void whenDellItem() {
        //создаем Tracker
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc"));
        // создаю StubInput споследовательноятью действий (удаление заявки по номеру ID
        Input input = new StubInput(new String[]{"3", item.getId() , "6"});
        //создаю StartUI и вызываю метод unit()
        new StartUI(input, tracker).init();
        assertNull(tracker.findById(item.getId()));
    }



    @Test
    public void whenFindID() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name", "desc"));
        // создаю StubInput споследовательноятью действий (поиск заявки по номеру ID
        Input input = new StubInput(new String[]{"4", item.getId() , "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("name"));
    }
    @Test
    public void whenFindName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("subname", "desc1"));
        // создаю StubInput споследовательноятью действий (поиск заявки по имени заявки
        Input input = new StubInput(new String[]{"5", "subname" , "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("subname"));
    }

}


