package task2;

import java.time.LocalDate;
import java.time.LocalTime;

public interface Client {
    String getEmail();
    String getCountry();
    LocalTime getLastActiveTime();
}
