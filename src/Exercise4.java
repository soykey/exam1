import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise4 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            System.out.println("整数同士の割り算をします。");
            System.out.print("1番目の整数を入力してください ->");
            int a = Integer.parseInt(br.readLine());
            System.out.print("2番目の整数を入力してください ->");
            int b = Integer.parseInt(br.readLine());
            if (b==0){
                System.out.println("ゼロで割り算をしました。");
            } else {
                System.out.println(a+" / "+b+" = "+(a/b));
            }
        } catch (IOException e) {}
    }
}
