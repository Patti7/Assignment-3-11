import java.util.Scanner;

public class DaysInMonth {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the month(1-12): ");
      int month  = scanner.nextInt();
      System.out.println("Enter the year: ");
      int year = scanner.nextInt();

      int days = daysInMonth(month, year);

      System.out.println(month + "/" + year + "has" + days + "days.");
   }

   public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);
   }

   public static int daysInMonth (int month, int year) {
    return switch (month) {
        case 2 -> isLeapYear(year) ? 29 : 28;
        case 4, 6 , 9 , 11 -> 30;
        default -> 31;
    };
   }
}
