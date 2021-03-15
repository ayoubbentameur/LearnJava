import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_Class_Calender {
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt);

        GregorianCalendar gc=new GregorianCalendar(2019,11,6);
                gc.add(GregorianCalendar.YEAR,1);
                Date dt2=gc.getTime();
                System.out.println(dt2);
    }
}
