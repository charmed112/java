package comparator2;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class start {
    private static ArrayList<Notebook> list = new ArrayList();
    public static void main (String[] args){

        list.add( new Notebook(30000, 8));
        list.add( new Notebook(55000, 16));
        list.add( new Notebook(40000, 6));
        list.add( new Notebook(29000, 8));
        Collections.sort(list, new SortPrice());
        System.out.println("Сортировка по цене:");
        print();
        System.out.println("Сортировка по памяти:");
        Collections.sort(list, new SortRam());
        print();
        System.out.println("Сортировка по памяти если равны то по цене:");
        Collections.sort(list, new SortPriceAfterRam());
        print();
    }
        public static void print(){
        for (Notebook notebook: list)
            System.out.println(notebook.getPrice() + " " + notebook.getRam());
        }
}

