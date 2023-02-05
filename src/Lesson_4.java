import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson_4 {
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

        for (Integer element : aList) {
            if (element % 2 == 0)
                anewList.add(element);
        }
        System.out.println();
        System.out.print(anewList);
    }
}
