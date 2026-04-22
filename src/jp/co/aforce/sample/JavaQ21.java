package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaQ21 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        String str3 = str1.substring(1, 3) + str2.substring(2, 5);
        System.out.println(str3);
        
        
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2026, 11, 19);
        long daysUntil = ChronoUnit.DAYS.between(today, birthday);
        
        System.out.println("今日の日付: " + today);
        System.out.println("次の誕生日: " + birthday);
        System.out.println("誕生日まであと " + daysUntil + " 日です！");
        
        System.out.println("Hello\tWorld\nJava");	
        
 		
    }


}
