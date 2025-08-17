package com.gmail.zernetcsgo.hw15;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    private final Map<Integer, String> map = new DataRepository().getData();

    public String getAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALL NAMES:\n");
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((id, name) -> sb.append(
                String.format("%d) %d, %s%n", count.incrementAndGet(), id, name)
        ));
        return sb.toString().trim();
    }

    public String getById(int id) {
        if (map.containsKey(id)) {
            return String.format("NAME: id %d, %s", id, map.get(id));
        } else {
            return "No data!";
        }
    }
}
