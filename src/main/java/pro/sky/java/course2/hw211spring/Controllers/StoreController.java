package pro.sky.java.course2.hw211spring.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw211spring.Services.StoreService;
import pro.sky.java.course2.hw211spring.data.Item;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }


    @GetMapping(path = "/add")
    public Item[] addItem(@RequestParam int[] id) {
        return storeService.addItem(id);
    }

    @GetMapping(path = "/get")
    public List<Item> getItem() {
        return storeService.getItem();

    }


}
