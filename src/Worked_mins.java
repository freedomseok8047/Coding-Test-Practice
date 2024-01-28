import java.util.Scanner;

public class Worked_mins {

    // 월 ~ 금 5일간 직원의 총 근무 시간을 분으로 나타내라
    // 출퇴근 시간은 HH:MM 형식이고 직원은 하루를 넘기지 않는다 0시 이후 출근, 24시 이전 퇴근
    // 유효성 체크 시간은 00~23 , 분 00~59 사이 숫자

    // 계획 hh:mm 형식의 스트링을 인풋  받아서
    // :으로 분리하고
    // 정수로 바꾸고
    // 분으로 바꾸고
    // 반복문으로 5번 반복
    // 유효성 체크 추가 해보자
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 인풋 받을 스캐너 선언

        int[] workTime = new int[5];

        // 월 ~ 금 반복할 반복 문
        for (int day = 0 ; day < 5 ; day++ ){
            int startHr = 0;
            int endHr = 0;
            int startMin = 0;
            int endMin = 0;
            int startTimeInMin = 0;
            int endTimeInMin = 0;


            while (true) {

                String startTimeInput = scanner.next();

                if (isValidTimeFormat(startTimeInput)) {
                    String[] startTimeParts = startTimeInput.split(":");
                    startHr = Integer.parseInt(startTimeParts[0]);
                    startMin = Integer.parseInt(startTimeParts[1]);
                    startTimeInMin = (startHr * 60 + startMin);
                    if (startHr >= 0 && startHr <= 23 && startMin >= 0 && startMin < 60) {
                        workTime[day] -= (startHr * 60 + startMin);
                        break;
                    }
                }
            }


            while (true) {
                String endTimeInput = scanner.next();
                if (isValidTimeFormat(endTimeInput)) {
                    String[] endTimeParts = endTimeInput.split(":");
                    endHr = Integer.parseInt(endTimeParts[0]);
                    endMin = Integer.parseInt(endTimeParts[1]);
                    endTimeInMin = (endHr * 60 + endMin);

                    if (endHr >= 0 && endHr <= 23 && endMin >= 0 && endMin < 60
                    && endTimeInMin - startTimeInMin > 0  ) {
                        break;
                    }
                }
            }


        }
        int totalWorkTime = 0 ;
        for (int day = 0 ; day < 5 ; day++){
            totalWorkTime += workTime[day];
        }

        System.out.println(totalWorkTime);

    }

    private static boolean isValidTimeFormat(String time) {
        return time.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]$");
    }
}




































