// package com.masayoshi;

//Best practice
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%03d:%02d:%02d",h,min,sec);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(15));
        System.out.println(String.format("%05d", 123));
    }
}

/* my solution. I did not know String.format.

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        //exceeds limit
        if (seconds > 359999) {
            return null;
        }

        int ss = seconds % 60;
        int mm = (seconds / 60) % 60;
        int hh = (seconds / 60) / 60;

        String sec = null;
        String min = null;
        String hour = null;

        if (ss < 10) {
            sec = "0" + ss;
        } else {
            sec = Integer.toString(ss);
        }

        if (mm < 10) {
            min = "0" + mm;
        } else {
            min = Integer.toString(mm);
        }

        if (hh < 10) {
            hour = "0" + hh;
        } else {
            hour = Integer.toString(hh);
        }

        String str = hour + ":" + min + ":" + sec;

        return str;
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(60));
        System.out.println(makeReadable(86399));
        System.out.println(makeReadable(359999));
    }
}
*/
