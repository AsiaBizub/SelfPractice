package Replit_Tasks;

import java.util.Scanner;

public class Replit157_Methods_12_Time_Conversion {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    timeConversion(scan.nextLine());
}

    public static void timeConversion(String s) {








    }

}


/*
Instructions from your teacher:
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock,
and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock,
and 12:00:00 on a 24-hour clock.
Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45



LocalTime:
Hours: hh
Minutes: mm
Seconds: ss
Am/Pm: a

String s = s.split(":");

		 String hours = time[0];
		 String minutes = time[1];
		 String seconds = time[2].substring(0,2);
		 String amPm = time[2].substring(2,4);


		 if(time.equals("AM)")){
		   if(hours.equals("12"))
		   hours ="00";
		   System.out.println(hours+":"+minutes":"+seconds");
		 }else{
		   if(!hour.equals("12")){
		     int h = Integer.parseInt(hours);
		     h = h+12;
		     hours= ""+h;
		   }
		   System.out.println(hours":"+minutes+":"+seconds");

 */

