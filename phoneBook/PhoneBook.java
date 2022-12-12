package phoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        Map<String, Long> phoneBook = new HashMap<>();

        phoneBook.put("Ваня Иванов", 89264598751L);
        phoneBook.put("Петя Петров", 89223432451L);
        phoneBook.put("Леха Алексеев", 84255985221L);
        phoneBook.put("Таня Петрова", 89252498751L);
        phoneBook.put("Галя Иванова", 89234987231L);
        phoneBook.put("Саня Сидоров", 89654459341L);
        phoneBook.put("Ваня Ванечкин", 89232507831L);
        phoneBook.put("Рус Петров", 89264247951L);
        phoneBook.put("Серега Сергеев", 89264598751L);
        phoneBook.put("Маша Романова", 89264598751L);
        phoneBook.put("Катя", 89264542341L);
        phoneBook.put("Ксюша Петрова", 89223459841L);
        phoneBook.put("Иван Павлов", 89234642342L);
        phoneBook.put("Александр Петров", 89234452451L);
        phoneBook.put("Работа", 89243298751L);
        phoneBook.put("Дом", 89234459751L);
        phoneBook.put("Мой Номер", 89223462251L);
        phoneBook.put("Сева Тимофеев", 89264234321L);
        phoneBook.put("Тимофей Тимофеев", 89234698751L);
        phoneBook.put("Саня Петров", 89234524751L);

        phoneBook.entrySet().forEach(System.out::println);
    }
}