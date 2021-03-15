import java.util.Calendar;
import java.util.Date;


public class Date_Practice {
    public static void main(String[] args) {

        Date d=new Date();
        Date d2=new Date(1997,3,10);
        System.out.println("Date 'd' is after Date 'd2' : "+d.after(d2));
                // create calendar objects.
                Calendar cal = Calendar.getInstance();
                Calendar future = Calendar.getInstance();

                // print the current date
                System.out.println("Current date: " + cal.getTime());

                // change year in future calendar
                future.set(Calendar.HOUR_OF_DAY,00);
                System.out.println("Hours is " + future.get(Calendar.HOUR_OF_DAY));

                // check if calendar date is after current date
                Date time = future.getTime();

                if (future.before(cal)) {
                    System.out.println(" Good Night");

                }
            }

        }




