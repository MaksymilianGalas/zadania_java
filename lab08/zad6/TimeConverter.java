package zad6;

import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        LocalTime time = LocalTime.parse("10:30", formatter);

        String country;
        ZoneId zoneId;
        int hoursToAdd;
        System.out.println("Wybierz kraj / miasto:");
        System.out.println("1. USA (New York)");
        System.out.println("2. Japonia (Tokio)");
        System.out.println("3. Australia (Sydney)");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                country = "USA (New York)";
                zoneId = ZoneId.of("America/New_York");
                hoursToAdd = -6;
                break;
            case 2:
                country = "Japonia (Tokio)";
                zoneId = ZoneId.of("Asia/Tokyo");
                hoursToAdd = 7;
                break;
            case 3:
                country = "Australia (Sydney)";
                zoneId = ZoneId.of("Australia/Sydney");
                hoursToAdd = 8;
                break;
            default:
                System.out.println("Nieprawidłowy wybór!");
                return;
        }

        // Przelicz czas na czas w wybranym kraju / mieście
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.now(), time);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Warsaw"))
                .withZoneSameInstant(zoneId)
                .plusHours(hoursToAdd);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy H:mm");
        String output = zonedDateTime.format(outputFormatter);

        // Wyświetl wynik
        System.out.println("W " + country + " jest teraz " + output);
    }
}
