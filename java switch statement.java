import java.util.*;
import java.lang.*;
import java.io.*;
class GUVI
{
	public static void main (String[] args) throws java.lang.Exception
	{
	import java.util.Scanner;
public class Exercise5 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    // Get the name for the Week
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
}



for loop

public class main {
public static void main (String args[]){
    int leapYear = 1900;

    if (leapYear <= 2020){
        for (int x = 0; x <= 10; x++){ 
            System.out.print(leapYear + " ");
            leapYear = leapYear + 4;
        }
        System.out.println(" ");
        int x = 0;
    }
}
}
	}
}
