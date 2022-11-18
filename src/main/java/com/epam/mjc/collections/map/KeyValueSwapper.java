package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> finalMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            if (!finalMap.containsKey(entry.getValue())) {
                finalMap.put(entry.getValue(), entry.getKey());
            } else {
                if (entry.getKey() < finalMap.get(entry.getValue())) {
                    finalMap.remove(entry.getValue());
                    finalMap.put(entry.getValue(), entry.getKey());
                }
            }
        }
        return finalMap;
    }
}
