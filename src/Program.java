public class Program {
    public static void main(String[] args) {
        Map map = new Map(4,4,3);
        map.printMap();
        while(true){
            map.run();
        }
    }
}
