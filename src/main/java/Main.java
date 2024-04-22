import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(500);
            integerList.add(element);
        }
        System.out.println(" Список из 500 элементов " + integerList);

        Set<Integer> uniqueElements = new HashSet<>(integerList);
        List<Integer> sortedUniqueElements = new ArrayList<>(uniqueElements);
        Collections.sort(sortedUniqueElements);

        System.out.println(" Отсортированный cписок  уникальных элементов " + sortedUniqueElements);
        System.out.println(" Список только уникальных элементов " + uniqueElements);
    }
}

/*
Задание 1 :Сгенерировать список из 500 целочисленных элементов
Достаточно создать объект Random random = new Random();
И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);

Имея данный список и знания полученный об интерфейсе Set,
вывести в консоль:

1)отсортированный набор уникальных элементов
2)набор только уникальных элементов
*/