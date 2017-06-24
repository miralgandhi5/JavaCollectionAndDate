import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;

/**
 * Created by miral on 6/22/2017.
 */
public class FormatDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);


    }
}
