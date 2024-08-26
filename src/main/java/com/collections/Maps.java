package com.collections;

import java.util.*;

public class Maps {

    public Map<String, Integer> createInventory(List<String> items) {
        // todo: Implement the logic to create a map that tracks the count of each item in the list
        Map<String, Integer> inventario = new HashMap<>();

        for (String item : items) {
            if (inventario.containsKey(item)){
                inventario.put(item, inventario.get(item)+1);
            }
            else{
                inventario.put(item, 1);
            }
        }
        return inventario;
    }

    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to add or increment items in the inventory using elements from the items list
        for (String item : items) {
            if (inventory.containsKey(item)){
                inventory.put(item, inventory.get(item)+1);
            }
            else{
                inventory.put(item, 1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        // todo: Implement the logic to decrement items in the inventory using elements from the items list
        for (String item : items){
            if (inventory.get(item)>0){
                inventory.put(item, inventory.get(item)-1);
            }
        }
        return inventory;
    }

    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        // todo: Implement the logic to remove an item from the inventory if it matches the item string
        if (inventory.containsKey(item)){
            inventory.remove(item);
        }
        return inventory;
    }

    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        // todo: Implement the logic to create a list containing all (item_name, item_count) pairs in the inventory
        List<Map.Entry<String,Integer>> inventario = new ArrayList<>();
        for (String item : inventory.keySet()) {
            if (inventory.get(item)>0){
                inventario.add(new AbstractMap.SimpleEntry<>(item, inventory.get(item)));
            }
        }
        return inventario;
    }
}