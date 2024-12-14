package practice.SomeFunctions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class AboutDate {
    public static void main(String[] args) {
//        LocalTime now = LocalTime.now();
//        LocalDate date = LocalDate.now();
//        System.out.println(date + " " + now);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
