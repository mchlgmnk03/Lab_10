package task2;

import java.time.LocalTime;

public class FacebookClient implements Client {
    private final FacebookUser user;

    public FacebookClient(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getCountry().toString();
    }

    @Override
    public LocalTime getLastActiveTime() {
        return user.getLastActiveTime();
    }
}
