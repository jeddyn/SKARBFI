import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int zestawy = scanner.nextInt();
        if(zestawy > 0 && zestawy <= 50){
            for(int i = 0; i < zestawy; i++){
                PathFinder pathFinder = new PathFinder(scanner);
                int[] wyniki = pathFinder.znajdzSkarb();
                wyswietlWyniki(wyniki);
            }
        }
    }

    private static void wyswietlWyniki(int[] wyniki){
        int x = wyniki[0];
        int y = wyniki[1];

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