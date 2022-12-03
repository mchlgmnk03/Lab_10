package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@AllArgsConstructor
public class FacebookUser extends AbsUser{
    private String email;
    private Country country;
    private LocalTime lastActiveTime;
}
