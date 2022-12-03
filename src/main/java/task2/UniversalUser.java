package task2;

import java.time.LocalTime;

public class UniversalUser implements Client {
    private final AbsUser user;

    public UniversalUser(AbsUser user) {
        this.user = user;
    }


    @Override
    public String getEmail() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getEmail();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getEmail();
        }
        return null;
    }

    @Override
    public String getCountry() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getCountry().toString();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getCountry().toString();
        }
        return null;
    }

    @Override
    public LocalTime getLastActiveTime() {
        if (user instanceof TwitterUser) {
            return ((TwitterUser) user).getLastActiveTime();
        } else if (user instanceof FacebookUser) {
            return ((FacebookUser) user).getLastActiveTime();
        }
        return null;
    }
}
