import java.util.ArrayList;
import java.util.Iterator;

public class Exercise2C {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        list.add(74);
        list.add(51);
        list.add(83);
        list.add(29);
        list.add(8);
        list.add(45);
        list.add(36);
        list.add(62);
        list.add(90);
        list.add(17);

        Iterator<Integer> itre = list.iterator();

        while (itre.hasNext()) {
            sum+= itre.next();
        }
        System.out.println("合計 = "+sum);
    }
}
