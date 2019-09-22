import java.util.ArrayList;
import java.util.Scanner;


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
        for (Target num : listTarget) {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == arr[0] && j == arr[1]){
                        if (arr[0] == num.x && arr[1] == num.y){
                            System.out.print(" O ");
                            rocket--;
                        } else if (arr[0] != num.x && arr[1] != num.y){
                            System.out.print(" X ");
                            rocket--;
                        }
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
            if(arr[0] != num.x && arr[1] != num.y){
                System.out.println(" You missed");
                System.out.println(rocket + " rockets left");
                System.out.println("Enemy: " + listTarget.size());
            } else if (arr[0] == num.x && arr[1] == num.y && listTarget.size() < 0){
                System.out.println(" You Won");
                System.out.println(rocket + " rockets left");
                System.out.println("Enemy: " + listTarget.size());
                System.exit(0);
            }
            if (rocket < 1 ){
                System.exit(0);
            }
            }

        }
    }
