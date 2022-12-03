package task2;
import java.time.LocalTime;

public class MessageSender {
    public void send(String text, UniversalUser user, String country) {
        String msg = "Message with text :\n<<" + text + ">>\nWas sent to user with email: " +
                user.getEmail() + "\nFrom country " + country;
        if (user.getCountry() != null && country.equals("Ukraine"))
            if (LocalTime.from(user.getLastActiveTime()).getHour() <= 1)
                System.out.println(msg);
    }
}