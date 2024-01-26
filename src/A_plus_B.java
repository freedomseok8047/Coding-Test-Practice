import java.io.*;
import java.util.*;
public class A_plus_B {
    // 문제 1 - 난이도 1
    // A+B (단, A,B는 1이상9이하의 정수)
    //
    // 입력형식 : 테스트 케이스 갯수 T 입력받고 시작, TABABAB...
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int testcase = 1 ; testcase <= T ; testcase++ ){

            System.out.print("Case_#" + testcase + ":");

            int A;
            do {
                 A = scanner.nextInt();
            }while( A < 0 || A > 9 ); //A가 0보다 작거나 9보다 클경우 루프 계속 돌기

            int B;
            do {
                B = scanner.nextInt();
            }while(B<0||B>9);

            int sum = A + B ;
            System.out.println(sum);


        }
    }

}
