import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class les9 {
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
            anewList.add(element);
            System.out.print(anewList);
        }
        for (int i = 0; i < anewList.size(); i++) {
            for (int j = 1 + i; j < anewList.size(); j++) {
                int temp = anewList.get(i);
                if (temp > aList.get(j)) {
                    int x = anewList.get(j);
                    anewList.set(i, x);
                    anewList.set(j, temp);
                    for (Integer element : aList) {
                        anewList.add(element);
                        System.out.println(anewList);
                    }
                }
            }
        }
    }
}