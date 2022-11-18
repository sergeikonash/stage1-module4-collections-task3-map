package com.epam.mjc.collections.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");
        List<String> list = Arrays.asList(sentence.split(" "));
        for (String s : list) {
            s = s.trim();
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }
}
