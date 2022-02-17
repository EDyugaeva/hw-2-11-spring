package pro.sky.java.course2.hw211spring.Services;

import pro.sky.java.course2.hw211spring.data.Item;

import java.util.List;

public interface StoreService {
    Item[] addItem(int[] arr);
    List<Item> getItem ();
}
