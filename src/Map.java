import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.JarOutputStream;


public class Map {
    int height;
    int width;
    int rocket;
    Target target;
    Target target2;
    Target target3;
    ArrayList<Target> listTarget = new ArrayList<>();

    public Map(int height, int width, int rocket){
        this.height = height;
        this.width = width;
        this.rocket = rocket;
        target = new Target(3,3);
        target2 = new Target(1,2);
        target3 = new Target(1,3);
        listTarget.add(target);
        listTarget.add(target2);
        listTarget.add(target3);
    }

    public void run(){
        this.printMapP();
    }


    public void printMap() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
    }


    public void printMapP(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Your target (separated by spaces): ");
        String input = inp.nextLine();
        String[] tmp = input.split(" ");
        int[] arr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i== arr[0] && j == arr[1]){
                    if (arr[0] == this.target.y && arr[1] == this.target.x){
                        System.out.print(" O ");
                        rocket--;
                    } else if (arr[0] != this.target.y && arr[1] != this.target.x){
                        System.out.print(" X ");
                        rocket--;
                    }
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        if(arr[0] == this.target.y && arr[1] == this.target.x){
            System.out.println("You win");
            System.out.println(rocket + " left");
            System.exit(0);
        } else if (rocket < 1) {
            System.out.println("You lose");
            System.out.println(rocket + " left");
            System.exit(0);
        }
    }
}
