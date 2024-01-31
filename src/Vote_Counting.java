import java.util.*;

public class Vote_Counting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int T = 0;
        while(true){
            T = scanner.nextInt();

            if( 1 <= T && T <= 100){
                break;
            }
        }

        for ( int k = 0; k < T ; k++){

            int n = 0;
            while(true) {
                n = scanner.nextInt();

                if (1 <= n && n <= 100) {
                    break;
                }
            }
                String[] result = new String[T];

                if ( n%5 == 0 ){
                    result[k] = "++++ ".repeat(n/5 -1) + "++++";
                }else {
                    result[k] = "++++ ".repeat(n / 5) + "|".repeat(n % 5);
                }
                System.out.println(result[k]);
            }
        }

    }
