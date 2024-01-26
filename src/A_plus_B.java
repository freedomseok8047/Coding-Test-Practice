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

// while ~ if ~ break 구문
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int T = scanner.nextInt();
//
//        for (int testcase = 1; testcase <= T; testcase++) {
//            System.out.print("Case_#" + testcase + ":");
//
//            int A;
//            while (true) {
//                A = scanner.nextInt();
//                if (A >= 1 && A <= 9) {
//                    break;
//                }
//            }
//
//            int B;
//            while (true) {
//                B = scanner.nextInt();
//                if (B >= 1 && B <= 9) {
//                    break;
//                }
//            }
//
//            int sum = A + B;
//            System.out.println(sum);
//        }
//    }

// for 구문 대신에 while로 반복
// public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int T = scanner.nextInt();
//
//    int testcase = 1;
//    while (testcase <= T) {
//        System.out.print("Case_#" + testcase + ":");
//
//        int A;
//        do {
//            A = scanner.nextInt();
//        } while (A < 0 || A > 9);
//
//        int B;
//        do {
//            B = scanner.nextInt();
//        } while (B < 0 || B > 9);
//
//        int sum = A + B;
//        System.out.println(sum);
//
//        testcase++;
//    }
//}


// do~while 과 그냥 while 차이점 : do~while은 최소 1번은 실행

//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    int T = scanner.nextInt();
//
//    for (int testcase = 1; testcase <= T; testcase++) {
//        System.out.print("Case_#" + testcase + ":");
//
//        int A = scanner.nextInt();
//        while (A < 0 || A > 9) {
//            A = scanner.nextInt();
//        }
//
//        int B = scanner.nextInt();
//        while (B < 0 || B > 9) {
//            B = scanner.nextInt();
//        }
//
//        int sum = A + B;
//        System.out.println(sum);
//    }
//}