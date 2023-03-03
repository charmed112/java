package comparator2;

import java.util.Comparator;

public class SortPriceAfterRam  implements Comparator<Notebook> {
    @Override
    public int compare(Notebook notebook1, Notebook notebook2) {

        if (notebook1.getRam() < notebook2.getRam()) {
            return -1;
        }
        if (notebook1.getRam() > notebook2.getRam()) {
            return 1;
        }
        if (notebook1.getRam() == notebook2.getRam()) {
            return 0;
        }
        if (notebook1.getPrice() < notebook2.getPrice()) {
            return -1;
        }
        if (notebook1.getPrice() == notebook2.getPrice()) {
            return 0;
        }
        return 1;
    }
}

