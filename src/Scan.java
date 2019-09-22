import java.util.Scanner;

public class Scan {
    public void scan(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Your target (separated by spaces): ");
        String input = inp.nextLine();
        String[] tmp = input.split(" ");
        int[] arr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
    }
}
