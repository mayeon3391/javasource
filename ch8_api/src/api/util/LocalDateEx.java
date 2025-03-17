package api.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); // 2025-03-13T14:37:49.846010700

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.print(date.getYear() + "년 ");
        System.out.print(date.getMonthValue() + "월 ");
        System.out.println(date.getDayOfMonth() + "일");
        System.out.println("5일 뒤 : " + date.plusDays(5));
        System.out.println("3개월 전 : " + date.minusMonths(3));

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.print(time.getHour() + "시 ");
        System.out.print(time.getMinute() + "분 ");
        System.out.println(time.getSecond() + "초");
        System.out.println("5시간 뒤 : " + time.plusHours(5));

    }
}
