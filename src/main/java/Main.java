import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max=50,min=0;
        int sets = scanner.nextInt();

        if(sets > min && sets <= max){
            for(int i = 0; i < sets; i++){
                PathFinder pathFinder = new PathFinder(scanner);
                int[] result = pathFinder.findTreasure();
                showResult(result);
            }
        }
    }

    private static void showResult(int[] result){
        int x = result[0];
        int y = result[1];

        if (x == 0 && y == 0) {
            System.out.println("studnia");
        } else {
            if (y > 0) {
                System.out.println("0 " + y);
            } else if(y<0){
                System.out.println("1 " + -y);
            }
        }
        if (x != 0) {
            if (x >= 0) {
                System.out.println("3 " + x);
            } else {
                System.out.println("2 " + -x);
            }
        }
    }
}