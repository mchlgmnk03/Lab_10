package task2;

import java.time.LocalDate;
import java.time.LocalTime;

public class Login {
    public Client login(String loginMethod) {
        if (loginMethod.equals("twitter")) {
            return new TwitterClient(new TwitterUser("dobosevych@gmail.com", Country.Ukraine, LocalTime.now()));
        } else if (loginMethod.equals("facebook")) {
            return new FacebookClient(new FacebookUser("dobosevych@gmail.com", Country.Ukraine, LocalTime.now()));
        }
        throw new IllegalArgumentException("No such loginMethod");
    }
}
