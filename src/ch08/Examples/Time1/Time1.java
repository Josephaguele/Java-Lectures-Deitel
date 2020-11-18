package ch08.Examples.Time1; // Time1.java
// Time1 class declaration maintains the time in 24-hour format.

public class Time1
{
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // set a new time value using universal time; ensure that
    // the data remains consitent by setting invalid values to zero
    public void setTime( int h, int m, int s)
    {
        hour = (( h >= 0 && h < 24) ? h : 0); // validate hour
        minute = ( ( m >= 0 && m < 60) ? m : 0); // validate minute
        second = ( ( s >= 0 && s < 60 ) ? s : 0); // validate second
    } // end method setTime

    // convert to String in universal-time format (HH: MM: SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute, second );
    } // return method toUniversalString

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%d:%2d:%02d %s",
                ((hour == 0 || hour == 12) ? 12: hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM") );
    } // END METHOD toString
} // end class Time1
