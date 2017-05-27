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

    public int[] findTreasure(){
        int leads = scanner.nextInt();
        if(leads > 0 && leads <= 100000){
            for(int j = 0; j < leads; j++){
                int direction = scanner.nextInt();
                int step = scanner.nextInt();
                makeMove(direction, step);
            }
        }
        return new int[]{x,y};
    }

    private void makeMove(int direction, int step){
        switch (direction) {
            case 0:
                y += step;
                break;
            case 1:
                y -= step;
                break;
            case 2:
                x -= step;
                break;
            case 3:
                x += step;
                break;
        }
    }
}
