import java.util.HashMap;
import java.util.Map;

public class seminar5 {
    public static void main(String[] args) {
        // 1. Объявить и инициализировать словарь hashMap<String, String>. 
        Map<String, String> FIOMap = new HashMap<>();
        System.out.println(
                "Задание №1\nИнициализируем словарь. Добавляем в него 5 пар ключ-значение.");
        System.out.println();

        //2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м").
        FIOMap.put("Лунин Иван Дмитриевич 29 м", "Java");
        FIOMap.put("Солнышкина Инна Петровна 24 ж", "Java");
        FIOMap.put("Сидоркина Ольга Олеговна 34 ж", "Java");
        FIOMap.put("Алексеев Михаил Александрович 21 м","Java");
        FIOMap.put("Жуков Сергей Андреевич 37 м", "Java");

        //Вывод на экран содержимого словаря
        System.out.println("Содержимое словаря:");
        System.out.println(FIOMap);
        System.out.println();

        //3. Изменить значения, сделав пол большой буквой.
            for (Map.Entry<String, String> pair : FIOMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            key = key.substring(0, key.length() - 1) + key.substring(key.length() - 1).toUpperCase();
            FIOMap.put(key, value);
            System.out.println(key + " " + value);
        }
        //4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
        
        for (Map.Entry<String, String> pair : FIOMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            String[] words = key.split(" ");
            System.out.println(words[0] + " " + words[1].substring(0, 1) + "." + words[2].substring(0, 1) + ".");
        }
        //5. *Сортировать значения по возрасту и вывести отсортированную коллекцию на экран.
        System.out.println("Сортировка по возрасту:");
        FIOMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}

