import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //System.out.println("Hello World");
    int int_day;
    System.out.print("Enter day (1-31): ");
    int_day=sc.nextInt();
    int int_month;
    System.out.print("Enter month  (1- 12): ");
    int_month=sc.nextInt();
    int int_year;
    System.out.print("Enter Year (20XX): ");
    int_year=sc.nextInt();
    //System.out.println (int_day + "-" + int_month + "-" + int_year);
    //System.out.println (int_month);
     //System.out.println (int_year)  Mmohit makkar;
    int my_age =50;
    String month_name = switch (int_month){
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 ->"June";
      case 7 -> "JUly";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Invalid month number!"; } ;
     System.out.println(int_day + "-" + month_name + "-" + int_year);

     if (int_month < 3) { 
      int_month += 12;
      int_year -= 1;
    }

     int j = int_year / 100 ; 
     int k = int_year % 100 ;
      int h = (int_day + (13 * (int_month + 1)) / 5 + k + (k / 4) + (j / 4) + 5 * j) % 7;
     System.out.println( h);

    String day_name = switch (h){
      case 0 ->"Saturday";
      case 1 -> "Sunday";
      case 2 -> "Monday";
      case 3 -> "Tuesday";
      case 4 -> "Wednessday";
      case 5 -> "Thursday";
      case 6 -> "Friday";
      
     
      default -> "Invalid "; } ;
     System.out.println(day_name);

    }
  }



