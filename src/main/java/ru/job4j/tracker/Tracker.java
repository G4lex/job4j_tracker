package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
        }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int siz = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (Objects.equals(key, item.getName())) {
                rsl[siz] = item;
                siz++;
            }
        }
        rsl = Arrays.copyOf(rsl, siz);
        return rsl;
    }

    public Item findById(int id) {
       int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean result = false;
        item.setId(id);
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }
}