import java.util.Scanner;

public class Map {
    int height;
    int width;
    int rocket;
    Target target;

    public Map(int height, int width, int rocket){
        this.height = height;
        this.width = width;
        this.rocket = rocket;
        target = new Target(4,4);
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
        String[] tmp = input.split("\\s+");
        int[] arr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(i == arr[0] && j == arr[1] && arr[0] == this.target.x && arr[1] == this.target.y){
                    if (arr[0] == this.target.x && arr[1] == this.target.y){
                        System.out.print(" 0 ");
                        rocket--;
                    } else {
                        System.out.print(" X ");
                    }
                }
                System.out.print(" - ");
            }
            System.out.println();
        }
    }
}
