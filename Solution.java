import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        if(Integer.parseInt(year)>=2000 && Integer.parseInt(year)<=3000){
            //suraj kamdi with refernce to StackOverflow.com
             Calendar suraj=Calendar.getInstance(); //abstract class calender
            suraj.set(Integer.parseInt(month),  Integer.parseInt(day), Integer.parseInt(year)); //passing the values
            String dayName = new DateFormatSymbols().getWeekdays()[suraj.get(Calendar.DAY_OF_WEEK)]; // it will get the name of day
             System.out.println(dayName.toUpperCase());
        }
    }
}
