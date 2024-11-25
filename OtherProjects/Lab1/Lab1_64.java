package Lab1;
import java.util.Scanner;

public class Lab1_64 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String strMonth = input.nextLine();
        int month;
        
        if(strMonth.equals("January") || strMonth.equals("Jan.") || strMonth.equals("Jan") || strMonth.equals("1")){
            month = 1;
        } else if(strMonth.equals("February") || strMonth.equals("Feb.") || strMonth.equals("Feb") || strMonth.equals("2")){
            month = 2;
        } else if(strMonth.equals("March") || strMonth.equals("Mar.") || strMonth.equals("Mar") || strMonth.equals("3")){
            month = 3;
        } else if(strMonth.equals("April") || strMonth.equals("Apr.") || strMonth.equals("Apr") || strMonth.equals("4")){
            month = 4;
        } else if(strMonth.equals("May") || strMonth.equals("May.") || strMonth.equals("5")){
            month = 5;
        } else if(strMonth.equals("June") || strMonth.equals("Jun.")|| strMonth.equals("Jun") || strMonth.equals("6")){
            month = 6;
        } else if(strMonth.equals("July") || strMonth.equals("Jul.") || strMonth.equals("Jul") || strMonth.equals("7")){
            month = 7;
        } else if(strMonth.equals("August") || strMonth.equals("Aug.") || strMonth.equals("Aug") || strMonth.equals("8")){
            month = 8;
        } else if(strMonth.equals("September") || strMonth.equals("Sept.") || strMonth.equals("Sep") || strMonth.equals("9")){
            month = 9;
        } else if(strMonth.equals("October") || strMonth.equals("Oct.") || strMonth.equals("Oct") || strMonth.equals("10")){
            month = 10;
        } else if(strMonth.equals("November") || strMonth.equals("Nov.") || strMonth.equals("Nov") || strMonth.equals("11")){
            month = 11;
        } else if(strMonth.equals("December") || strMonth.equals("Dec.") || strMonth.equals("Dec") || strMonth.equals("12")){
            month = 12;
        } else {
            month = 0;
        }

        System.out.print("Enter the year: ");
        int year = input.nextInt();
        int days;
        switch (month) {
            case 1:
                days = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    days = 29;
                else
                    days = 28;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                days = 0;
                break;
        }
        if(days == 0) {
            System.out.println("Invalid month");
            return;
        } else {
            System.out.println("Number of days in month " + month + " of year " + year + " is " + days + " days.");
        }
        
    }
}