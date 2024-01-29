import java.util.Scanner;

public class WorkTime {

    // 월 ~ 금 5일간 직원의 총 근무 시간을 분으로 나타내라
    // 출퇴근 시간은 HH:MM 형식이고 근무 시간은 하루를 넘기지 않는다
    // 0시 이후 출근, 24시 이전 퇴근
    // 유효성 체크 시간은 00~23 , 분 00~59 사이 숫자
    // 하루 최소 근로시간 1분 이상

    // 계획 hh:mm 형식의 스트링을 인풋  받아서
    // :으로 분리하고
    // 정수로 바꾸고
    // 분으로 바꾸고
    // 반복문으로 5번 반복
    // 유효성 체크 추가 해보자
    public static void main(String[] args) {
        int endTimeInMin = 0;
        int startTimeInMin = 0;

        int startHr =0 ;
        int startMin = 0;

        int endHr =0 ;
        int endMin = 0;

        String startTimeInput;
        String endTimeInput;

        Scanner scanner = new Scanner(System.in);

        int[] workTime = new int[5];

        for(int day = 0 ; day < 5 ; day++ ){

            while(true) {
                startTimeInput = scanner.next();

                if (isValidInput(startTimeInput)) {
                    startHr = Integer.parseInt(startTimeInput.split(":")[0]);
                    startMin = Integer.parseInt(startTimeInput.split(":")[1]);
                    startTimeInMin = (startHr * 60) + startMin;
                    break;
                }
            }

            while(true) {
                endTimeInput = scanner.next();

                if (isValidInput(startTimeInput)) {
                    endHr = Integer.parseInt(endTimeInput.split(":")[0]);
                    endMin = Integer.parseInt(endTimeInput.split(":")[1]);
                    endTimeInMin = endHr * 60 + endMin;

                    if (endTimeInMin - startTimeInMin > 0) {
                        workTime[day] = endTimeInMin - startTimeInMin;
                        break;
                    }
                }
            }
        }

        int total = 0;
        for(int time : workTime ){
            total += time;
        }

        System.out.println(total);


    }
    public static boolean isValidInput(String time) {
        return time.matches("^([0-1][0-9]|2[0-3]):([0-5][0-9])$");
    }
}




































