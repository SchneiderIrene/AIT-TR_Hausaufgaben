package hausaufgaben_48;

import java.time.LocalDate;
import java.time.LocalTime;

public class HA_48_01 {
    public static void main(String[] args) {
//        Получить и вывести на экран:
//        -текущую дату
//                -текущий год, месяц и день
//        Создать дату , например день рождения и вывести на экран
//        Создать две даты и проверить на равенство
//        Получить и вывести на экран текущее время
//        текущее время + 3 часа
//        Создать дату на неделю позже сегодняшней
//        Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());

        LocalDate localDate1 = LocalDate.of(2023, 1,29);
        LocalDate localDate2 = LocalDate.of(2024, 1,29);
        System.out.println(localDate1.equals(localDate2));
        System.out.println(localDate1.isEqual(localDate2));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.plusHours(3));

        LocalDate localDate3 = today.plusWeeks(1);
        System.out.println(localDate3);

        LocalDate yesterday = today.minusDays(1);
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(yesterday.isAfter(today));
        System.out.println(yesterday.isBefore(today));
        System.out.println(tomorrow.isAfter(today));
        System.out.println(tomorrow.isBefore(today));





    }
}
