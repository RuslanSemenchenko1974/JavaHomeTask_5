import java.util.ArrayList;

/*Задание 2.

Пусть дан список сотрудников:
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Иван Савин
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. */
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        System.out.print("\033\143");
        List <String> names = Arrays.asList("Светлана Петрова",
        "Кристина Белова",
        "Анна Мусина",
        "Анна Крутова",
        "Иван Юрин",
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Иван Савин",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов");
        Collections.sort(names);
        System.out.println(names);
        String[] firstNames = new String[names.size()];
        int i = 0;
        for (var item:names){
            String[] name = item.split(" ");
            firstNames[i] = name[0];
            i++;
        }
        i=1;
        Map <String, Integer> sortNames = new HashMap<>();
        int count = 0;
        for (int j = 0; j < firstNames.length-1; j++) {
        if (firstNames[j].equals(firstNames[j+1])){
          i++;  
        }
        else {
            //System.out.printf("%s : %d", firstNames[j], i);
            sortNames.put(firstNames[j],i);
            //System.out.println();
            if (i>count) count = i;
            i = 1;
        }
        }
        //System.out.println(sortNames); 
        for (int j = count; j >= 1; j--) {
           for (var item1:sortNames.entrySet()) {
            if (item1.getValue()==j){
                System.out.println(item1);
            }
           }
        }
        
    }
}
