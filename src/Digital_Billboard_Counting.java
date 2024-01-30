import java.io.*;
import java.util.*;
public class Digital_Billboard_Counting {
    public static void main(String[] args){
        Map<String, String> segments = new HashMap<>();
        segments.put("0","1110111");
        segments.put("1","0010010");
        segments.put("2","1011101");
        segments.put("3","1011011");
        segments.put("4","0111010");
        segments.put("5","1101011");
        segments.put("6","1101111");
        segments.put("7","1110010");
        segments.put("8","1111111");
        segments.put("9","1111011");
        segments.put(" ","0000000");

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for ( int k = 0 ; k < T ; k++){
            String a = scanner.next();
            String b = scanner.next();
//            System.out.println( a + " " + b);

            a = " ".repeat(5- a.length()) + a;
            b = " ".repeat(5- b.length()) + b;

            int total = 0;
            for ( int i = 0; i <= 4; i++){
                for (int j = 0 ; j <= 6 ; j++){
                    if (segments.get(String.valueOf(a.charAt(i))).charAt(j)
                            != segments.get(String.valueOf(b.charAt(i))).charAt(j)){
                        total++;
                    }
                }
            }

            System.out.println(total);

        }

    }
}
