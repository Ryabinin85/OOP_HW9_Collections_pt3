package exercises;

import javax.management.InstanceAlreadyExistsException;
import java.util.HashMap;
import java.util.Map;

public class Exercise1_3 {
    static Map<String, Integer> stringIntegerMap = new HashMap<>();

    public static void add(String key, Integer value) throws InstanceAlreadyExistsException {

        if (!stringIntegerMap.containsKey(key)) {
            stringIntegerMap.put(key, value);
        } else if (stringIntegerMap.containsKey(key) && stringIntegerMap.containsValue(value)) {
            throw new InstanceAlreadyExistsException("Такой объект уже есть!");
        } else stringIntegerMap.put(key, value);
    }

    public static void main(String[] args) throws InstanceAlreadyExistsException {
        add("str1", 2);
        add("str2", 1);
        add("str1", 2);
        add("str1", 5);
        stringIntegerMap.entrySet().forEach(System.out::println);
    }
}