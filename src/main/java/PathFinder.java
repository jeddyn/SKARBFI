import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-26.
 */
public class PathFinder {

    private int x;
    private int y;
    private Scanner scanner;

    public PathFinder(Scanner scanner){
        this.x = 0;
        this.y = 0;
        this.scanner = scanner;
    }

    public int[] znajdzSkarb(){
        int wskazowki = scanner.nextInt();
        if(wskazowki > 0 && wskazowki <= 100000){
            for(int j = 0; j < wskazowki; j++){
                int kierunek = scanner.nextInt();
                int krok = scanner.nextInt();
                zrobRuch(kierunek, krok);
            }
        }
        return new int[]{x,y};
    }

    private void zrobRuch(int kierunek, int krok){
        switch (kierunek) {
            case 0:
                y += krok;
                break;
            case 1:
                y -= krok;
                break;
            case 2:
                x -= krok;
                break;
            case 3:
                x += krok;
                break;
        }
    }
}
