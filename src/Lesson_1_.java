// Задание 1.
// Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n
import java.util.Scanner;

public class Lesson_1_ {
    public static void  main (String[] args){
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    System.out.printf("Наше число для факториала: %d \n", num);
    int result = 1;
    for (int i = 1; i <= num; i ++){
        result = result*i;
    }
    System.out.printf("Факториал %d равен:  %d", num, result);
    in.close();
    }
}
