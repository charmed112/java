package comparator2;

import java.util.Comparator;

public class Notebook{
    private int price;
    private int ram;

    public Notebook(int price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

//    @Override // сорт цифр
//    public int compareTo(Notebook notebook) {
//        if (price == notebook.getPrice()) {
//            return 0;
//        }
//        if (price < notebook.getPrice()) {
//            return -1;
//        }
//        return 1;
//    }
//        @Override //сорт строк
//        public int compareTo(Notebook notebook) {
//            return ram.compareTo(notebook.getRam());
//        }

}
