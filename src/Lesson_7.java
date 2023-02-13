import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lesson_7 {
    public static void main(String[] args) {

        String int1 = new String("1");
        String int2 = new String("2");
        String int3 = new String("3");
        String int4 = new String("4");

        LinkedList<String> numbers = new LinkedList<>();
        numbers.add(int1);
        numbers.add(int2);
        numbers.add(int3);
        numbers.add(int4);

        System.out.println(numbers);
        // использование итератора по убыванию
        ListIterator<String> listIterator = numbers.listIterator(numbers.size());
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
        //Использование итератора списка
        //Iterator<String> iterator = numbers.descendingIterator();
        //while (iterator.hasNext())
        //{
            //System.out.println(iterator.next());
    //}

    }

}
