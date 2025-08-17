package com.gmail.zernetcsgo.hw15;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataRepository {

    public Map<Integer, String> getData() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(387, "Lucy");
        map.put(231, "Alice");
        map.put(394, "Bob");
        map.put(172, "Tom");
        return map;
    }
}