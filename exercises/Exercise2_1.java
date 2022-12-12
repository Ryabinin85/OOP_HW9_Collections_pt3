package exercises;

import java.util.*;

import static java.util.List.of;

public class Exercise2_1 {
    static Map<String, List<Integer>> map1 = new HashMap<>();
    static Map<String, Integer> map2 = new HashMap<>();

    public static void addToMap1(String key, List<Integer> value) {
        map1.put(key, value);
    }

    public static void addToMap2(String key, Integer value) {
        map2.put(key, value);
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers1 = of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
        List<Integer> integers2 = of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
        List<Integer> integers3 = of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
        List<Integer> integers4 = of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
        List<Integer> integers5 = of(random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));

        addToMap1("str1", integers1);
        addToMap1("str2", integers2);
        addToMap1("str3", integers3);
        addToMap1("str4", integers4);
        addToMap1("str5", integers5);

        map1.entrySet().forEach(System.out::println);

        for (Map.Entry<String, List<Integer>> values : map1.entrySet()) {
            int sum = values.getValue().stream().mapToInt(Integer::intValue).sum();
            addToMap2(values.getKey(), sum);
        }

        map2.entrySet().forEach(System.out::println);
    }
}