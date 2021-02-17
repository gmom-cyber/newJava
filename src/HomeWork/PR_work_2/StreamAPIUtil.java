package HomeWork.PR_work_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIUtil {

    public static List<Human> getHuman(){
        List<Human> result = new ArrayList<>();
        result.add(new Human(50, "Ivan", "Ivanov", LocalDate.of(1971,2,8), 175));
        result.add(new Human(60, "Fedor", "Alexandrov",LocalDate.of(1961,3,7), 195));
        result.add(new Human(34, "Alexander ", "Sergeev", LocalDate.of(1987,9,24), 177));
        result.add(new Human(71, "Petr", "Fedorov", LocalDate.of(1950,4,16), 171));
        result.add(new Human(19, "Dima", "Fedorov", LocalDate.of(2002,11,11), 167));
        result.add(new Human(12, "Nikita", "Petrov", LocalDate.of(2009,9,24), 151));

        return result;
    }

    public static List<Human> sortHumanByAge(List<Human> h) {//По Возростанию
        return h.stream()
                .sorted(Comparator.comparing(Human::getAge))
                .collect(Collectors.toList());
    }

    public static List<Human> sortHumanByAgeReversed(List<Human> h) {//По убыванию
        return h.stream()
                .sorted(Comparator.comparing(Human::getAge).reversed())
                .collect(Collectors.toList());
    }

    public static List<Human> AllHumanLessThen(List<Human> humans, int age) {// фильтрация по возрасту меньше
        return humans.stream().filter(i -> i.getAge() < age).collect(Collectors.toList());
    }


    // Вывод в консоль
    public static void printHuman(List<Human> humans) {
        humans.forEach(System.out::println);
    }
}


