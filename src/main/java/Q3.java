import java.util.Calendar;

public class Q3 {
    public static void main(String[] args) {
        int waitingPeople = 1400605;
        solution(waitingPeople);
    }

    private static void solution(int waitingPeople) {
        int daysOfYear = 0;

        for (int i = 10; i > 0; i--) {
            daysOfYear += (int) Math.pow(2, i);
        }

        int waitingPeriod =  waitingPeople / 1200;
        int year = waitingPeriod / daysOfYear;
        int remainingDays = waitingPeriod % daysOfYear;
        int month = 0;

        for (int i = 10; i > 0; i--) {
            month++;
            if (remainingDays < (int)Math.pow(2, i))
                break;
            remainingDays -= (int)Math.pow(2, i);
        }

        int day = remainingDays;
        int finalRemainPeople = waitingPeople % 1200;
        int hour = finalRemainPeople / 100 + 9;
        int[] departureMinute = {25, 40, 55, 70, 85, 100};
        int boardingMinute = finalRemainPeople % 100 + 1;
        int sameDayDepartureMinute = 0;

        for (int i = 0; i < departureMinute.length; i++) {
            if (departureMinute[i] > boardingMinute) {
                sameDayDepartureMinute = i * 10;
                break;
            }
        }

        Calendar today = Calendar.getInstance();
        int minute = today.get(Calendar.MINUTE) + sameDayDepartureMinute;

        if (minute > 60) {
            minute = minute - 60;
            hour++;
        }

        System.out.println((year + 2020) + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분");
    }
}
