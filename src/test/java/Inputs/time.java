package Inputs;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    private static void convert( int i )
    {
        int hours = i / 3600;
        i = i - hours * 3600;
        int minutes = i / 60;
        i = i - minutes * 60;
        int seconds = i;
        System.out.printf( "Hours: %d, minutes: %d, seconds: %d%n", hours, minutes,
                seconds );
    }
    public static void main(String[] args) {
        convert( 149580 );
    }
}