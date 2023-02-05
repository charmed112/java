package src.les3;
public class les3 {
    public static void main(String[] args){
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <1000; i++){
            sb.append(" TEST");
        }

        //System.out.println(str);
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);
    }
}
