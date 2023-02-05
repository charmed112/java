import java.util.ArrayList;
import java.util.List;
public class les5_masiv_v_spisok {
    public static void main(String[] args) {
        int[] anArray = new int[] {1, 2, 3, 4, 5};
       List<Integer> aList = new ArrayList<>();
       for (int element: anArray){
           aList.add(element);

       }
        System.out.println(aList);
    }

}

