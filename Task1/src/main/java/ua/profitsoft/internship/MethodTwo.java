package ua.profitsoft.internship;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MethodTwo {

    public static List<Map.Entry<String, Integer>> countNumberOfHashtags(List<String> list) {
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Matcher m = Pattern.compile("(?<=^|\\s)[#]\\w*").matcher(list.get(i));
            var buffer = new HashMap<String, Integer>();

            while (m.find()) {
                int count = res.getOrDefault(m.group(), 0);
                buffer.put(m.group(), count + 1);
            }

            buffer.forEach((k, v) -> {
                res.merge(k, v, (v1, v2) -> v);
            });
        }
        return res.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .limit(5)
                .collect(Collectors.toList());
    }
}
