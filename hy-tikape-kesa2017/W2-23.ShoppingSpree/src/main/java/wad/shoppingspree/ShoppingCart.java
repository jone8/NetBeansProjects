package wad.shoppingspree;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ShoppingCart {

    private Map<String, Integer> items;

    public ShoppingCart() {
        this.items = new TreeMap<>();
    }

    public List<String> getItems() {
        return this.items.keySet().stream().sorted().collect(Collectors.toList());
    }

    public boolean contains(String item) {
        return this.items.containsKey(item);
    }

    public boolean getEmpty() {
        return this.items.isEmpty();
    }

    public void add(String item) {
        if (!this.items.containsKey(item)) {
            this.items.put(item, 0);
        }

        this.items.put(item, this.items.get(item) + 1);
    }

    public int getCount(String item) {
        if (!this.items.containsKey(item)) {
            return 0;
        }

        return this.items.get(item);
    }
}
