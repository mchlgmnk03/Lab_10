package task2;

import java.time.LocalTime;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser user) {
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
