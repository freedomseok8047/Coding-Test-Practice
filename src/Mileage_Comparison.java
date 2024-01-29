import java.util.*;
public class Mileage_Comparison {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;

        while(true) {
            A = scanner.nextInt();

            if(A >= 0 && A <= 100000) {
                break;
            }
        }

        while(true){
            B = scanner.nextInt();
            if(B >= 0 && B <= 100000) {
                break;
            }
        }


        if ( A > B ){
            System.out.println("A");
        } else if ( A < B ) {
            System.out.println("B");
        } else{
            System.out.println("same");
        }

    }
}
