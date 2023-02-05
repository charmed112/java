import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson_5 {
    public static void main(String[] args) {
        List<Integer> anewList = new ArrayList<>();
        int[] num = new int[10];
        Random randomGenerator = new Random();
        for (int i = 0; i < num.length; ++i) {
            num[i] = randomGenerator.nextInt(10);
        }
        List<Integer> aList = new ArrayList<>();
        for (Integer element : num) {
            aList.add(element);
        }
        System.out.print(aList);
        //сортировка пузырьком
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 1 + i; j < aList.size(); j++) {
                int temp = aList.get(i);
                if (temp > aList.get(j)) {
                    int x = aList.get(j);
                    aList.set(i, x);
                    aList.set(j, temp);
                }
            }
        }
        for (Integer element : aList)
            anewList.add(element);
        System.out.printf("\nСреднее арифмитичекое:");
        int sum = 0;
        for(int i = 0; i < anewList.size(); i++)
            sum = sum + anewList.get(i);
        System.out.println(sum / anewList.size());// не понимаю как создать отдельный метод чтоб значение sum возвращалось.
        System.out.println(anewList); //отсортированный список
        System.out.printf("Минимальное значение это: %d \nМаксимальнео значение  это: %d", anewList.get(0),
                anewList.get(anewList.size() - 1));
    }
}


