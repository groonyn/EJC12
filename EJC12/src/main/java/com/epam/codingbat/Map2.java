package main.java.com.epam.codingbat;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Nikolay Grunin
 * @version 1.0
 * Created 10.12.2017
 * Committed 18.12.2017
 */
public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : strings) {
            map.put(s, s.length());
        }
        return map;
    }
//TODO-me finish the section.
}
