import java.util.*;

public class Worked_mins {

    // 월 ~ 금 5일간 직원의 총 근무 시간을 분으로 나타내라
    // 출퇴근 시간은 HH:MM 형식이고 직원은 하루를 넘기지 않는다 0시 이후 출근, 24시 이전 퇴근
    // 유효성 체크 시간은 00~23 , 분 00~59 사이 숫자
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] workTimes = new int[5];

        for (int day = 0; day < 5; day++) {
            while (true) {
                String startTimeInput = scanner.next();

                if (isValidTimeFormat(startTimeInput)) {
                    String[] startTimeParts = startTimeInput.split(":");
                    int startHour = Integer.parseInt(startTimeParts[0]);
                    int startMinute = Integer.parseInt(startTimeParts[1]);

                    if (startHour >= 0 && startHour <= 23 && startMinute >= 0 && startMinute <= 59) {
                        workTimes[day] += (startHour * 60 + startMinute);
                        break;
                    }
                }
            }

            while (true) {
                String endTimeInput = scanner.next();

                if (isValidTimeFormat(endTimeInput)) {
                    String[] endTimeParts = endTimeInput.split(":");
                    int endHour = Integer.parseInt(endTimeParts[0]);
                    int endMinute = Integer.parseInt(endTimeParts[1]);

                    if (endHour >= 0 && endHour <= 23 && endMinute >= 0 && endMinute <= 59) {
                        workTimes[day] -= (endHour * 60 + endMinute);
                        break;
                    }
                }
            }
        }

        int totalWorkTime = 0;
        for (int day = 0; day < 5; day++) {
            totalWorkTime += Math.abs(workTimes[day]);
        }

        System.out.println(totalWorkTime);
    }

    private static boolean isValidTimeFormat(String time) {
        return time.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]$");
    }
}
