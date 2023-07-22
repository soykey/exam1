import java.util.ArrayList;

public class Exercise2B {
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

        for (int a : list) {
            sum+=a;
        }
        System.out.println("合計 = "+sum);
    }
}
