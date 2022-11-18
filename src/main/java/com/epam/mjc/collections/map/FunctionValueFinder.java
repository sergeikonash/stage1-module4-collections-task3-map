package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        if (functionMap.containsValue(requiredValue)) {
            return true;
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : sourceList) {
            map.put(integer, 5*integer + 2);
        }
        return map;
    }
}
