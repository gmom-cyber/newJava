package HomeWork.PR_work_2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = StreamAPIUtil.getHuman();
        //Тестирование сортировки
        List<Human> sortedHumanAsc = StreamAPIUtil.sortHumanByAge(humans);
        List<Human> sortedHumanDesc = StreamAPIUtil.sortHumanByAgeReversed(humans);
        //StreamAPIUtil.printHuman(sortedHumanAsc);
        //StreamAPIUtil.printHuman(sortedHumanDesc);

        // фильтрация по возрасту меньше, чем 20,
        List<Human> AllHumanLessThen20 = StreamAPIUtil.AllHumanLessThen(humans,20);
        StreamAPIUtil.printHuman(AllHumanLessThen20);

        // фильтрация по имени «содержит ‘е’», конкатенация первых букв имен.

    }
}
