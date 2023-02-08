/**
Задание 1.

Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
import java.util.*;
public class Task_1 {

    public static void main(String[] args) {
        Map <String, List<Integer>> phoneB = new HashMap<>();
        List <Integer> phoneN = new ArrayList();
        System.out.print("\033\143");
        phoneN.add(123456);
        phoneN.add(123457);
        phoneB.put("Иванов",List.copyOf(phoneN));
        phoneN.clear();
        phoneN.add(777456);
        phoneN.add(666457);
        phoneN.add(654321);
        phoneB.put("Сидоров",List.copyOf(phoneN));
        phoneN.clear();
        phoneN.add(111111);
        phoneB.put("Петров",List.copyOf(phoneN));
        for (var item:phoneB.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }         
        System.out.println(phoneB);

    }
}