package exercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise2_2 {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(321, "one");
        map.put(123, "two");
        map.put(7653, "three");
        map.put(1, "four");
        map.put(109807, "five");
        map.put(2, "six");
        map.put(467654, "seven");
        map.put(12345643, "eight");
        map.put(21, "nine");
        map.put(10, "ten");

        map.entrySet().forEach(System.out::println);
    }
}
