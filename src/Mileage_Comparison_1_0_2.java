import java.util.Scanner;

public class Mileage_Comparison_1_0_2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int A = 0;
        int B = 0;

        while(true) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            if(isInRange(A) && isInRange(B)){
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
    public static boolean isInRange(int value){
        return (value >= 0 && value <= 100000);
    }
}
