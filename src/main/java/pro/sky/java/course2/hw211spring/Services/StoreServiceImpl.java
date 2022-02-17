package pro.sky.java.course2.hw211spring.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.hw211spring.data.Item;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreServiceImpl implements StoreService {

    List<Item> box = new ArrayList<>();

    @Override
    public Item[] addItem(int[] arr) {
        Item[] addedArr = new Item[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Item newItem = new Item(arr[i]);
            box.add(newItem);
            addedArr[i] = newItem;
        }
        return addedArr;
    }

    @Override
    public List<Item> getItem() {
        return box;
    }
}

