import java.util.*;
public class Tren_del_Fin_del_Mundo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        int minX = 1000, minY = 1000;

        while(true){
            N = scanner.nextInt();
            if ( N >= 1 && N <= 1000 ){
                break;
            }
        }

        for ( int i = 0 ; i < N ; i++){

            int x = 0, y = 0 ;
            while(true){
                x = scanner.nextInt();
                if ( Math.abs(x) <= 1000 ){
                    break;
                }
            }

            while(true){
                y = scanner.nextInt();
                if ( Math.abs(y) <= 1000 ){
                    break;
                }
            }

            if (y < minY){
                minX = x;
                minY = y;
            }

        }
        System.out.println(minX + " " + minY);
    }
}
