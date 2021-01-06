package job7;


import java.util.GregorianCalendar;
public class J3 {
    public static void main(String[] args) {
        GregorianCalendar day = new GregorianCalendar();
        int a = day.get(GregorianCalendar.YEAR);
        int b = day.get(GregorianCalendar.MONTH);
        int c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Before "+ a + " Year " + b + " Month " + c + " Day");
        long l = 1234567898765L;
        day.setTimeInMillis(l);
        a = day.get(GregorianCalendar.YEAR);
        b = day.get(GregorianCalendar.MONTH);
        c = day.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Next " + a + " Year " + b + " Month " + c + " Day");
    }
}
