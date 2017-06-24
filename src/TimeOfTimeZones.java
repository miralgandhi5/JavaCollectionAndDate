import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
/**
 * Created by miral on 6/22/2017.
 */
public class TimeOfTimeZones {
    public static void main(String[] args) {
        String[] zoneIds = TimeZone.getAvailableIDs();
        for (int i = 0; i < zoneIds.length; i++) {
            TimeZone tz = TimeZone.getTimeZone(zoneIds[i]);
            System.out.print(tz.getID() + " " + tz.getDisplayName());
            Calendar calTZ = new GregorianCalendar(tz);
            calTZ.setTimeInMillis(new Date().getTime());

            System.out.println(calTZ.get(Calendar.HOUR)+":"+calTZ.get(Calendar.MINUTE)+":"+calTZ.get(Calendar.SECOND));
        }

       // ZoneId.getAvailableZoneIds().forEach(e-> System.out.println(LocalTime.now(ZoneId.of(e))));
    }
}
