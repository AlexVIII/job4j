package ru.parsentev.start;

import ru.parsentev.models.*;
public class Tracker {
	public Item[] items = new Item[100];
	
		public static void main(String[] args) {
			Item item = new Item("name", "desc", ol);
			System.out.println(item.getName() + " " + item.getDescription());
			Item task = new Task("name", "desc");
			System.out.println(task.getName() + " " + task.getDescription());
		}
}
